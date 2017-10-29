ViewPager
=========

<img src="icon.png" alt="Icon"/>

ViewPager辅助库

源码地址：[ProjectX][1]

[1]: https://github.com/AlexMofer/ProjectX/tree/master/viewpager

介绍
---

与ViewPager相关的一些工具类：
- **RecyclePagerAdapter**

    回收复用的PagerAdapter，实现方式类似于RecyclerView.Adapter。
- **ViewsPagerAdapter**

    普通View列表PagerAdapter
- **FragmentRemovePagerAdapter**

    FragmentPagerAdapter 与 FragmentStatePagerAdapter的结合体。

先决条件
----

- minSdkVersion 14
- 保持跟其他官方支持库版本一致（如：com.android.support:appcompat-v7）

入门
---

**引用:**

```java
dependencies {
    ...
    compile 'am.util:viewpager:26.1.0'
    ...
}
```

注意
---

- 保持跟其他官方支持库版本一致（如：com.android.support:appcompat-v7），否则可能出现错误。

支持
---

- Google+: https://plus.google.com/114728839435421501183
- Gmail: moferalex@gmail.com

如果发现错误，请在此处提出:
https://github.com/AlexMofer/ProjectX/issues

许可
---

Copyright (C) 2015 AlexMofer

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.