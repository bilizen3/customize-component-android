package com.flores.expandablecardview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.flores.expandablecardview.model.ItemExpandableEntity;

import java.util.List;

public class ExpandableCardView extends LinearLayout {
    private AppCompatTextView tvAmountOfFee, tvNumberOfQuota, tvExpirationDate, tvAmountOfFeeText;
    private LinearLayoutCompat llDetails;
    private AppCompatImageView ivExpandable;
    private Context context;
    private boolean expandable;

    public ExpandableCardView(Context context) {
        super(context);
        init(context);
    }

    public ExpandableCardView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ExpandableCardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.expandable_card_view, this, true);
        tvExpirationDate = findViewById(R.id.tvExpirationDate);
        tvNumberOfQuota = findViewById(R.id.tvNumberOfQuota);
        tvAmountOfFee = findViewById(R.id.tvAmountOfFee);
        tvAmountOfFeeText = findViewById(R.id.tvAmountOfFeeText);
        llDetails = findViewById(R.id.llDetails);
        ivExpandable = findViewById(R.id.ivExpandable);
        ivExpandable.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                hideAndShowListDetails();
            }
        });
    }


    public void setAmountOfFee(String amountOfFee) {
        this.tvAmountOfFee.setText(amountOfFee);
    }

    public void setNumberOfQuota(String numberOfQuota) {
        this.tvNumberOfQuota.setText(numberOfQuota);
    }

    public void setExpirationDate(String expirationDate) {
        this.tvExpirationDate.setText(expirationDate);
    }

    public void setAmountOfFeeText(String amountOfFeeText) {
        this.tvAmountOfFeeText.setText(amountOfFeeText);
    }

    public void addListDetails(List<ItemExpandableEntity> itemExpandableEntities) {
        for (ItemExpandableEntity item : itemExpandableEntities) {
            llDetails.addView(new ItemExpandableCardView(this.context, item));
        }
    }


    public void hideAndShowListDetails() {
        if (expandable) {
            expandable = false;
            llDetails.setVisibility(GONE);

        } else {
            expandable = true;
            llDetails.setVisibility(VISIBLE);
            AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
            anim.setDuration(1000);
            llDetails.startAnimation(anim);
        }

    }

}
