package br.com.clubelinkar.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.clubelinkar.android.R;
import br.com.clubelinkar.android.models.BasicInfo;

import java.util.List;

import static br.com.clubelinkar.android.util.UtilMethods.getDrawableIdFromFileName;

/**
 * Created by Tushar Saha on 12/2/15.
 * Audacity IT Solutions Ltd.
 */
public class OverviewAdapter extends RecyclerView.Adapter<OverviewAdapter.OverviewRowHolder> {
    private Context mContext;
    private List<BasicInfo> basicInfoList;

    public OverviewAdapter(Context context,List<BasicInfo> basicInfoList) {
        mContext = context;
        this.basicInfoList = basicInfoList;
    }

    @Override
    public OverviewRowHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_overview_item, null);
        OverviewRowHolder vh = new OverviewRowHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(OverviewRowHolder holder, int position) {
        holder.overviewItemIcon.setImageResource(getDrawableIdFromFileName(mContext,
                basicInfoList.get(position).getImageId()));
        holder.overviewItemTitle.setText(basicInfoList.get(position).getTitle());
        holder.overviewItemBody.setText(basicInfoList.get(position).getBody());
        if(position == getItemCount()-1) {
            holder.overviewItemBody.append("\n\n\n");
        }
    }

    @Override
    public int getItemCount() {
        return basicInfoList.size();
    }

    public class OverviewRowHolder extends RecyclerView.ViewHolder {
        private ImageView overviewItemIcon;
        private TextView overviewItemTitle;
        private TextView overviewItemBody;

        public OverviewRowHolder(View view) {
            super(view);
            overviewItemIcon = (ImageView)view.findViewById(R.id.overviewItemIcon);
            overviewItemTitle = (TextView)view.findViewById(R.id.overviewItemTitle);
            overviewItemBody = (TextView)view.findViewById(R.id.overviewItemBody);
        }
    }
 }
