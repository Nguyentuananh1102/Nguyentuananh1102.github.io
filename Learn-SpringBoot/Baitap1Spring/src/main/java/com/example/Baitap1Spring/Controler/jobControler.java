package com.example.Baitap1Spring.Controler;


import com.example.Baitap1Spring.Model.Job;
import com.example.Baitap1Spring.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class jobControler {

    @Autowired // inject bean
    private JobService jobService;

    //private List<Job> jobs;

    @GetMapping("/jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }

}
