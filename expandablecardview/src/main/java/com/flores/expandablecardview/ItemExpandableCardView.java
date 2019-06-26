package com.flores.expandablecardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.flores.expandablecardview.model.ItemExpandableEntity;

/**
 * ItemExpandableCardView
 *
 * @author bill.flores - Avantica
 * @since 06/25/2019
 */

public class ItemExpandableCardView extends LinearLayout {

    private AppCompatTextView tvName, tvValue;

    public ItemExpandableCardView(Context context, ItemExpandableEntity itemExpandableEntity) {
        super(context);
        init(context);
        setName(itemExpandableEntity.getName());
        setValue(itemExpandableEntity.getValue());
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_detail, this, true);
        tvName = findViewById(R.id.tvName);
        tvValue = findViewById(R.id.tvValue);
    }

    private void setName(String name) {
        this.tvName.setText(name);
    }

    private void setValue(String value) {
        this.tvValue.setText(value);
    }
}
