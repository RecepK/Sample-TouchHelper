package com.rkurban.library;

/**
 * Created by rkurban on 28.02.2018.
 */

public interface ItemTouchHelper {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}
