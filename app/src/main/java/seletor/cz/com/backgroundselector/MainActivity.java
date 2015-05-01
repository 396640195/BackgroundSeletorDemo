package seletor.cz.com.backgroundselector;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout container = (LinearLayout)this.findViewById(R.id.container);
        for (int i = 0; i < 2; ++i) {
            final ImageView view = new ImageView(this);
            int padding = 5;
            view.setPadding(padding, padding, padding, padding);
            view.setScaleType(ImageView.ScaleType.FIT_CENTER);
            view.setBackgroundResource(R.drawable.image_lock_item_bg_selector);
            view.setImageResource(R.drawable.ic_launcher);
            view.setActivated(true);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setSelected(!view.isSelected());
                }
            });
            container.addView(view);
        }
    }

}
