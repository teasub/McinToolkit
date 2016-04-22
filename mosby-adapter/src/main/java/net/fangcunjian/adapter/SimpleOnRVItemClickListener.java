/**
 * Copyright 2016 Mcin(teajson@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fangcunjian.adapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Create by Mcin on 16/3/9
 * RecyclerView的item点击事件监听器
 */
public interface SimpleOnRVItemClickListener {
    void onRVItemClick(ViewGroup parent, View itemView, int position);
}