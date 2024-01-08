package com.kts.sharelock.view;

import com.kts.sharelock.fragment.EditableListFragment;
import com.kts.sharelock.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
