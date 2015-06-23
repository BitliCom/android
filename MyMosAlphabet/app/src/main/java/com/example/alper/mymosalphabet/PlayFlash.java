package com.example.alper.mymosalphabet;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.Camera;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alper on 06/14/2015.
 */
public class PlayFlash implements Runnable {

    /**
     * Starts executing the active part of the class' code. This method is
     * called when a thread is started that has been created with a class which
     * implements {@code Runnable}.
     */


    private ArrayList playTime;

    public Camera getCam() {
        return cam;
    }

    public void setCam(Camera cam) {
        this.cam = cam;
    }

    int t = 0, slepTm = 0, smallGap = 200, bigGap = 500;

    int Mors_BOS = -1;
    int Mors_NOKTA= -2;
    Camera cam;
    Context ctx;
    Camera.Parameters p;


    public PlayFlash(Context ctx, ArrayList playTime) {
        this.ctx = ctx;
        this.playTime = playTime;
    }


    private void initCam() {
        try {
            if (ctx.getPackageManager().hasSystemFeature(
                    PackageManager.FEATURE_CAMERA_FLASH)) {
                cam = Camera.open();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(ctx, e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void initCamOn() {
        try {
            if (ctx.getPackageManager().hasSystemFeature(
                    PackageManager.FEATURE_CAMERA_FLASH)) {
                p = cam.getParameters();
                p.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                cam.setParameters(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(ctx, e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void initCamOff() {
        try {
            if (ctx.getPackageManager().hasSystemFeature(
                    PackageManager.FEATURE_CAMERA_FLASH)) {
                p = cam.getParameters();
                p.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                cam.setParameters(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(ctx, e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void run() {
        Iterator itr = playTime.iterator();
        initCam();
        while (itr.hasNext()) {
            try {
                int[] tyr = (int[]) itr.next();
                t = 0;
                while (t < tyr.length) {
                    slepTm = tyr[t];
                    if (slepTm > 0) {
                        initCamOn();
                        cam.startPreview();
                        Thread.sleep(slepTm);
                        initCamOff();
                        cam.stopPreview();
                        Thread.sleep(smallGap);
                    } else if (slepTm == Mors_BOS)
                        Thread.sleep(bigGap);
                    else if (slepTm == Mors_NOKTA)
                        Thread.sleep(smallGap);
                    t++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Toast.makeText(ctx, e.getMessage(),
                        Toast.LENGTH_SHORT).show();
            } finally {
                p.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                cam.setParameters(p);
                cam.stopPreview();

            }
            try {
                Thread.sleep(bigGap);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Toast.makeText(ctx, e.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        }
        cam.release();
    }

}