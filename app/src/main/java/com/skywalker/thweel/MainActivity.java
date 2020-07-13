package com.skywalker.thweel;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import com.google.android.material.navigation.NavigationView;
import android.view.View;
import androidx.core.view.GravityCompat;
import android.view.Display;
import android.view.ActionMode;
import androidx.appcompat.app.ActionBar;
import android.view.LayoutInflater;
import java.util.zip.Inflater;
import android.view.MenuItem;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.resources.TextAppearance;
import android.widget.TextView;
import android.view.Menu;
import android.graphics.BlendMode;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import net.grandcentrix.thirtyinch.TiActivity;
import net.grandcentrix.thirtyinch.TiPresenter;
import androidx.annotation.NonNull;
import android.util.Log;
import com.xmansoft.libs.butterknife.annotation.BindView;
import com.xmansoft.libs.butterknife.ButterKnife;


public class MainActivity extends  TiActivity<MainActivityPresenter ,MainView> implements MainView, BottomNavigationView.OnNavigationItemSelectedListener 
{

    

   
    public void setTitle(String newTitle) {
       changeTitle(newTitle);
    }


  


   


    //  @BindView (R.id.toolbar_title)
    // TextView toolbarTitle;
    //  @BindView (R.layout.toolbar_main)

   // private final int menu_settings_id =77;
    
    @BindView (R.id.toolbar)
    Toolbar toolbar;
//    @BindView (R.id.main_drawer_layout)
//    DrawerLayout drawer;
//    @BindView (R.id.nav_view_main)
//    NavigationView navigationView;
//    ActionBarDrawerToggle toggle;
    @BindView(R.id.nav_bottom)
    BottomNavigationView bNav;

    private static final int menu_settings_id = 0;

    private static final int menu_share_id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        	ButterKnife.bind(this);


 

        setSupportActionBar ( toolbar);
        getSupportActionBar().setElevation(5);
       
        getSupportActionBar().setSubtitle("We Made It Easy For You");
        
       
       
       bNav.setOnNavigationItemSelectedListener(this);

    }

    @NonNull
    @Override
    public MainActivityPresenter providePresenter() {
        return new MainActivityPresenter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
      MenuItem settings =  menu.add(0,menu_settings_id,Menu.NONE,R.string.settings);
     
      settings.setIcon(R.drawable.ic_toolbar_settings);
      settings.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        
        MenuItem share =  menu.add(0,menu_share_id,Menu.NONE,R.string.share);

        share.setIcon(R.drawable.ic_toolbar_share);
        share.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem p1) {
        switch (p1.getItemId()){
          //  case R.id.nav_home:
            //    changeTitle(getString(R.string.app_name));
          //  break;
            case R.id.nav_history:
                changeTitle("History");
                Log.d("Tahweel","OK");
                break;
            case R.id.nav_about:
                changeTitle("About");
                break;
                default:
                changeTitle(getString(R.string.app_name));
                
            
        }
        return true;
    }
    private void changeTitle(String newTitle){
        getSupportActionBar().setTitle(newTitle);
    }
}
