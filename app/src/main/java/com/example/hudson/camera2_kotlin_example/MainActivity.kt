package com.example.hudson.camera2_kotlin_example

import android.graphics.SurfaceTexture
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val surfaceListener = object: TextureView.SurfaceTextureListener {
        override fun onSurfaceTextureSizeChanged(p0: SurfaceTexture?, p1: Int, p2: Int) {
        }

        override fun onSurfaceTextureUpdated(p0: SurfaceTexture?) {
        }

        override fun onSurfaceTextureDestroyed(p0: SurfaceTexture?) = true

        override fun onSurfaceTextureAvailable(p0: SurfaceTexture?, p1: Int, p2: Int) {
            openCamera()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        if (texture_view.isAvailable) {
            openCamera()
        } else {
            texture_view.surfaceTextureListener = surfaceListener
        }
    }

    fun openCamera() {

    }
}
