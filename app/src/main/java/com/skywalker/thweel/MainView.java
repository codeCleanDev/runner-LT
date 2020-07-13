package com.skywalker.thweel;
import net.grandcentrix.thirtyinch.TiView;
import net.grandcentrix.thirtyinch.callonmainthread.CallOnMainThread;

public interface MainView extends TiView
{
    @CallOnMainThread
    void setTitle(String newTitle);
}
