package am.example.recyclepageradapter;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Locale;

import am.util.viewpager.adapter.RecyclePagerAdapter;


public class RecyclePagerActivity extends AppCompatActivity implements View.OnClickListener {

    private final MyRecyclePagerAdapter adapter = new MyRecyclePagerAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclepager);
        Toolbar mToolbar = findViewById(R.id.rp_toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            }
        }
        ViewPager vpContent = findViewById(R.id.rp_vp_content);
        findViewById(R.id.rp_btn_remove).setOnClickListener(this);
        findViewById(R.id.rp_btn_add).setOnClickListener(this);
        vpContent.setAdapter(adapter);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        adapter.onConfigurationChanged(newConfig);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rp_btn_remove:
                adapter.remove();
                break;
            case R.id.rp_btn_add:
                adapter.add();
                break;
        }
    }

    class MyPagerViewHolder extends RecyclePagerAdapter.PagerViewHolder {

        MyPagerViewHolder(ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_recyclepager_page, parent, false));
        }

        public void setData(String data) {
            ((TextView) itemView).setText(data);
        }
    }

    class MyRecyclePagerAdapter extends RecyclePagerAdapter<MyPagerViewHolder> {

        private int itemCount = 5;

        @Override
        public int getItemCount() {
            return itemCount;
        }

        @Override
        public MyPagerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyPagerViewHolder(parent);
        }

        @Override
        public void onBindViewHolder(MyPagerViewHolder holder, int position) {
            holder.setData(String.format(Locale.getDefault(),
                    getString(R.string.recyclepager_page), position + 1));
        }

        void add() {
            itemCount++;
            notifyDataSetChanged();
        }

        void remove() {
            itemCount--;
            itemCount = itemCount < 0 ? 0 : itemCount;
            notifyDataSetChanged();
        }
    }
}
