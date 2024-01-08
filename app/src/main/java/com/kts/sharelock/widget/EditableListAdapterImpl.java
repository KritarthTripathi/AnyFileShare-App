package com.kts.sharelock.widget;

import com.kts.sharelock.util.NotReadyException;
import com.kts.sharelock.model.Editable;
import com.genonbeta.android.framework.widget.ListAdapterImpl;

import java.util.List;

public interface EditableListAdapterImpl<T extends Editable> extends ListAdapterImpl<T>
{
    boolean filterItem(T item);

    T getItem(int position) throws NotReadyException;

    void notifyAllSelectionChanges();

    void notifyItemChanged(int position);

    void notifyItemRangeChanged(int positionStart, int itemCount);

    void syncSelectionList();

    void syncSelectionList(List<T> itemList);
}
