package gisclace.android_menu;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // Tab du premier menu
        TabSpec m1 = tabHost.newTabSpec("Menu 1");
        // Titre
        m1.setIndicator("Menu 1");
        Intent photosIntent = new Intent(this, Menu1.class);
        m1.setContent(photosIntent);

        // Tab du second menu
        TabSpec m2 = tabHost.newTabSpec("Menu 2");
        m2.setIndicator("Menu 2");
        Intent songsIntent = new Intent(this, Menu2.class);
        m2.setContent(songsIntent);

        // Tab du troisiéme menu
        TabSpec m3 = tabHost.newTabSpec("Menu 3");
        m3.setIndicator("Menu 3");
        Intent videosIntent = new Intent(this, Menu3.class);
        m3.setContent(videosIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(m1); // Tab menu 1
        tabHost.addTab(m2); // Tab menu 2
        tabHost.addTab(m3); // Tab menu 3

    }
}
