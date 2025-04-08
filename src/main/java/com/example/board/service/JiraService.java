package com.example.board.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JiraService {

    @Value("${jira.api.url}")
    private String jiraApiUrl;

    @Value("${jira.api.token}")
    private String jiraApiToken;

    @Value("${jira.api.email}")
    private String jiraApiEmail;

    public String simulateJiraCall(String task) {
        return "Simulating sending task to Jira: " + task + " -> " + jiraApiUrl;
    }
}