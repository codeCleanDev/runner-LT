package com.skywalker.thweel;
import net.grandcentrix.thirtyinch.TiPresenter;
import androidx.annotation.NonNull;

public class MainActivityPresenter extends TiPresenter <MainView> {

    @Override
    protected void onAttachView(@NonNull MainView view) {
        super.onAttachView(view);
       view.setTitle("Hello MVP");
    }
    
}
