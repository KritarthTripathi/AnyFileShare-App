package com.kts.sharelock.model;

import com.genonbeta.android.framework.object.Selectable;

public interface Editable extends Comparable, Selectable
{
    boolean applyFilter(String[] filteringKeywords);

    long getId();

    void setId(long id);
}
