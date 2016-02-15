package br.com.clubelinkar.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.clubelinkar.android.R;
import br.com.clubelinkar.android.models.Project;
import br.com.clubelinkar.android.util.QuoteTextView;
import br.com.clubelinkar.android.util.UtilMethods;

import java.util.List;

import static br.com.clubelinkar.android.util.UtilMethods.getDrawableIdFromFileName;

/**
 * Created by Tushar Saha on 12/4/15.
 * Audacity IT Solutions Ltd.
 */
public class TestimonialAdapter extends RecyclerView.Adapter<TestimonialAdapter.TestimonialViewHolder> {

    private Context mContext;
    private List<Project> projectList;

    public TestimonialAdapter(Context context, List<Project> projectList) {
        mContext = context;
        this.projectList = projectList;
    }

    @Override
    public TestimonialViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_testimonial, null);
        TestimonialViewHolder vh = new TestimonialViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TestimonialViewHolder holder, final int position) {
        holder.delegateImgView.setImageResource(getDrawableIdFromFileName(mContext,
                projectList.get(position).getDelegateImg()));
        holder.delegateNameView.setText(projectList.get(position).getDelegateName());
        holder.delegateDesignationView.setText(projectList.get(position).getDelegateDesignation());
        holder.quoteTextView.setText("[img src=ic_testimonial_quote_start/]"+" "+
                projectList.get(position).getComment()+" "+
                "[img src=ic_testimonial_quote_end/]");
        holder.webLinkImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilMethods.browseUrl(mContext,projectList.get(position).getReferenceUrl());
            }
        });
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    class TestimonialViewHolder extends RecyclerView.ViewHolder {

        private ImageView delegateImgView;
        private TextView delegateNameView;
        private TextView delegateDesignationView;
        private TextView quoteTextView;
        private ImageView webLinkImgView;

        public TestimonialViewHolder(View itemView) {
            super(itemView);
            delegateImgView = (ImageView) itemView.findViewById(R.id.delegateImgView);
            delegateNameView = (TextView) itemView.findViewById(R.id.delegateNameView);
            delegateDesignationView = (TextView) itemView.findViewById(R.id.delegateDesignationView);
            quoteTextView = (QuoteTextView)itemView.findViewById(R.id.quoteTextView);
            webLinkImgView = (ImageView)itemView.findViewById(R.id.webLinkImgView);
        }
    }
}
