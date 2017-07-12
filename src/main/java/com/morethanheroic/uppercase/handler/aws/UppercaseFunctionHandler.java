package com.morethanheroic.uppercase.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.morethanheroic.uppercase.domain.UppercaseRequest;
import com.morethanheroic.uppercase.domain.UppercaseResponse;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}
