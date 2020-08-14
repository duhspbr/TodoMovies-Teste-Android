package com.app.mvp.main.Interfaces;

import com.app.api.models.Movie;
import com.app.api.models.Similar;

public interface ISimilarCallback {
    void OnResponse(Similar similar);
    void OnFailure(String message);
}
