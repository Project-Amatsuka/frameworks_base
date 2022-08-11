package com.android.systemui.qs;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.android.systemui.R;

public class QSDragHandleView extends View {

    public QSDragHandleView(Context context) {
        super(context);
    }

    public QSDragHandleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public QSDragHandleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(generateBackground());
    }

    private GradientDrawable generateBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getContext().getColor(R.color.new_qs_drag_handle_color));
        post(() -> {
            gradientDrawable.setCornerRadius((float) (getHeight() / 2));
        });

        return gradientDrawable;
    }

}
