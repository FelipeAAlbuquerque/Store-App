package com.eazybytes.eazystore.service;

public interface IPaymentService {
    PaymentIntentResponseDto createPaymentIntent(PaymentIntentRequestDto requestDto);
}
