#!/bin/bash
# Sync
sudo install telegram /usr/bin
telegram -M "LTerminal: Sync started"
SYNC_START=$(date +"%s")

sudo -E apt-get -qq update
sudo -E apt-get -qq install curl

SYNC_END=$(date +"%s")
SYNC_DIFF=$((SYNC_END - SYNC_START))
telegram -M "LTerminal: Sync completed successfully in $((SYNC_DIFF / 60)) minute(s) and $((SYNC_DIFF % 60)) seconds"

# Build
telegram -M "LTerminal: Build started"
SYNC_START=$(date +"%s")

chmod +x gradlew
USE_SPLITBUILD=1 ./gradlew assembleDebug --no-daemon

SYNC_END=$(date +"%s")
SYNC_DIFF=$((SYNC_END - SYNC_START))
telegram -M "LTerminal: Build completed successfully in $((SYNC_DIFF / 60)) minute(s) and $((SYNC_DIFF % 60)) seconds"
telegram -f app/build/outputs/apk/debug/app-debug.apk "LTerminal - Prebuilt APK"