package com.govind8061.simplesimple

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MainObserver:DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Toast.makeText(owner as Context,"OBserver On Create",Toast.LENGTH_SHORT).show()
    }

}