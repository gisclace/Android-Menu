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
        Intent m1Intent = new Intent(this, Menu1.class);
        m1.setContent(m1Intent);

        // Tab du second menu
        TabSpec m2 = tabHost.newTabSpec("Menu 2");
        m2.setIndicator("Menu 2");
        Intent m2Intent = new Intent(this, Menu2.class);
        m2.setContent(m2Intent);

        // Tab du troisiéme menu
        TabSpec m3 = tabHost.newTabSpec("Menu 3");
        m3.setIndicator("Menu 3");
        Intent m3Intent = new Intent(this, Menu3.class);
        m3.setContent(m3Intent);

        // Tab du quatriéme menu
        TabSpec m4 = tabHost.newTabSpec("Menu 4");
        m4.setIndicator("Menu 4");
        Intent m4Intent = new Intent(this, Menu4.class);
        m4.setContent(m4Intent);

        // TabSpec --> TabHost
        tabHost.addTab(m1); // Tab menu 1
        tabHost.addTab(m2); // Tab menu 2
        tabHost.addTab(m3); // Tab menu 3
        tabHost.addTab(m4); // Tab menu 4

    }
}
