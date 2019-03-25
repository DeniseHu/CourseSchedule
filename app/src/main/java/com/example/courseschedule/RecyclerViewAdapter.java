package com.example.courseschedule;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private static final int TYPE_HEAD = 0;
    private static final int TYPE_LIST = 1;

    ArrayList<courseProvider> course = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<courseProvider> course) {
        this.course = course;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Declare variables for view class
        View view;
        //Create a variable for RecyclerViewHolder
        RecyclerViewHolder recyclerViewHolder;

        if (viewType == TYPE_LIST) {
            //Initialise these variables
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_list, parent, false);
            recyclerViewHolder = new RecyclerViewHolder(view, viewType);

            return recyclerViewHolder;

        } else if (viewType == TYPE_HEAD) {

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_layout, parent, false);
            recyclerViewHolder = new RecyclerViewHolder(view, viewType);

            return recyclerViewHolder;

        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        //create variables for courseProvider
        courseProvider courseProvider;

        if (holder.view_type == TYPE_LIST) {

            //initialise the variable
            courseProvider = course.get(position - 1);
            holder.list_week.setText(courseProvider.getWeeks());
            holder.list_lecture.setText(courseProvider.getLecture());
            holder.list_lab.setText(courseProvider.getLab());
            holder.list_lecturetopic.setText(courseProvider.getLecturetopics());
            holder.list_labtopic.setText(courseProvider.getLabtopics());

        } else if (holder.view_type == TYPE_HEAD) {

            holder.header_week.setText("WEEK");
            holder.header_activity.setText("ACTIVITY");
            holder.header_topic.setText("TOPIC");

        }

    }

    @Override
    public int getItemCount() {
        return course.size() + 1;

    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        int view_type;

        //Declare variable for list
        TextView list_week, list_lecture, list_lab, list_lecturetopic, list_labtopic;

        //Declare variable for header
        TextView header_week, header_activity, header_topic;

        public RecyclerViewHolder(View view, int viewType) {
            super(view);

            if (viewType == TYPE_LIST) {

                //to display list, initialise variables for list
                this.list_week = (TextView) view.findViewById(R.id.list_Week);
                this.list_lecture = (TextView) view.findViewById(R.id.list_Lecture);
                this.list_lab = (TextView) view.findViewById(R.id.list_Lab);
                this.list_lecturetopic = (TextView) view.findViewById(R.id.list_LectureTopic);
                this.list_labtopic = (TextView) view.findViewById(R.id.list_LabTopic);
                view_type = 1;

            } else if (viewType == TYPE_HEAD) {
                header_week = (TextView) view.findViewById(R.id.header_Week);
                header_activity = (TextView) view.findViewById(R.id.header_Activity);
                header_topic = (TextView) view.findViewById(R.id.header_Topic);
                view_type = 0;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {

        //inflate header
        if (position == 0)
            return TYPE_HEAD;
        return TYPE_LIST;
    }
}
