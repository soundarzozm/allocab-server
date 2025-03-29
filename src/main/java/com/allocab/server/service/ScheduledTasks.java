package com.allocab.server.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class ScheduledTasks {

  @Scheduled(cron = "0 17 * * 1-5 *")
  public void generateTrips() {
    System.out.println("Current time: " + LocalDateTime.now());
    // Generate the usual trips (from USERS table)
    // Generate trips from requests (from REQUESTS table)

    // 1. Fetch all users who have a trip scheduled for tomorrow
    // 2. Fetch all users who have requested for a trip scheduled for tomorrow
    // 3. Fetch all users who have requested a cancellation for tomorrow
    // 4. Process these users to get the final list of users who have a trip scheduled for tomorrow
    // 5. Generate the trips for these users
    // 6. Save the trips to the database
  }
}
