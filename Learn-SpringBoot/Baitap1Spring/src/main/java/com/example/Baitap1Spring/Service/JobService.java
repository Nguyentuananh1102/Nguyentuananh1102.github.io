package com.example.Baitap1Spring.Service;

import com.example.Baitap1Spring.Model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    //private JobService jobService;
    private List<Job> jobs;

    private JobService (){
        jobs = new ArrayList<>();
        jobs.add(new Job(1,"job1", "description1","location1",20,30));
        jobs.add(new Job(2,"job2", "description2","location2",40,50));
        jobs.add(new Job(3,"job3", "description3","location3",60,70));


    }

    public List<Job> getJobs(){
        return jobs;
    }
}
