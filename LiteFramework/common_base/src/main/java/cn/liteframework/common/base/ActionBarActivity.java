package cn.liteframework.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.liteframework.common.R;
import cn.liteframework.common.base.mvp.BasePresenter;
import cn.liteframework.common.widget.ActionBar;

/**
 * Describe：所有带actionBar的Activity基类
 * Created by 吴天强 on 2018/10/18.
 */

public abstract class ActionBarActivity<P extends BasePresenter> extends BaseMvpActivity<P> {

    //    @BindView(R2.id.actionbar)
    protected ActionBar actionBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actionBar = findViewById(R.id.actionbar);
    }

    protected void setTitleText(String title) {
        if (actionBar != null) {
            actionBar.setCenterText(title);
        }
    }

    protected void setTitleText(int title) {
        if (actionBar != null) {
            actionBar.setCenterText(getString(title));
        }
    }

    @Override
    protected boolean isActionBar() {
        return true;
    }
}
