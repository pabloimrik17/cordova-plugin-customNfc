/*jshint  bitwise: false, camelcase: false, quotmark: false, unused: vars */
/*global cordova, console */
"use strict";


// nfc provides javascript wrappers to the native phonegap implementation
var nfc = {
    HelloToast: function (callback, win, fail) {
        cordova.exec(win, fail, "NfcPlugin", "HelloToast", []);
    }
};

window.nfc = nfc;
