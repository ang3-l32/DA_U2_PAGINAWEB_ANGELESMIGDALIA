package com.residentsystem.controller;

import com.residentsystem.model.Activity;
import com.residentsystem.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {
    @Autowired
    private ActivityRepository activityRepository;

    @GetMapping
    public List<Activity> getAll() {
        return activityRepository.findAll();
    }

    @PostMapping
    public Activity create(@RequestBody Activity activity) {
        activity.setCreatedAt(LocalDateTime.now());
        return activityRepository.save(activity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Activity> update(@PathVariable Long id, @RequestBody Activity activity) {
        Activity existing = activityRepository.findById(id).orElse(null);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        activity.setId(id);
        activity.setCreatedAt(existing.getCreatedAt());
        return ResponseEntity.ok(activityRepository.save(activity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        activityRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
