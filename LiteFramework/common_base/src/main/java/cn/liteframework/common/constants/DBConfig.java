package cn.liteframework.common.constants;

import cn.liteframework.common.base.BaseApplication;
import cn.liteframework.common.R;

/**
 * Describe：数据库配置文件
 * Created by 吴天强 on 2018/11/5.
 */

public interface DBConfig {
    String DB_NAME = BaseApplication.getApplication().getString(R.string.app_name) + ".db";
}
