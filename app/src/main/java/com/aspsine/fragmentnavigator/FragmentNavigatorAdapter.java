package com.aspsine.fragmentnavigator;

import androidx.fragment.app.Fragment;
import net.grandcentrix.thirtyinch.TiFragment;

/**
 * Created by aspsine on 16/3/30.
 */
public interface FragmentNavigatorAdapter {

    public TiFragment onCreateFragment(int position);

    public String getTag(int position);

    public int getCount();
}
