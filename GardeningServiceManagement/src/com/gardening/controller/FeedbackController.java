package com.gardening.controller;

import com.gardening.models.Feedback;
import com.gardening.services.FeedbackService;

public class FeedbackController {
    public boolean send(Feedback f) {
        return new FeedbackService().addFeedback(f);
    }
}
