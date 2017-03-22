package com.chariotsolutions.nfc.plugin;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// using wildcard imports so we can support Cordova 3.x
import org.apache.cordova.*; // Cordova 3.x

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Parcelable;
import android.util.Log;

public class NfcPlugin extends CordovaPlugin /*implements NfcAdapter.OnNdefPushCompleteCallback*/ {
    // code runs in a thread
    
    public void HelloToast() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText("hola").show();
            }
        });
    }
}
