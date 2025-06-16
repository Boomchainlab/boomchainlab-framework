// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async.store

import com.agu_token.api.TestServerExtension
import com.agu_token.api.client.okhttp.AguTokenOkHttpClientAsync
import com.agu_token.api.models.Order
import com.agu_token.api.models.store.order.OrderCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrderServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.store().order()

        val orderFuture =
            orderServiceAsync.create(
                OrderCreateParams.builder()
                    .order(
                        Order.builder()
                            .id(10L)
                            .complete(true)
                            .petId(198772L)
                            .quantity(7)
                            .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(Order.Status.APPROVED)
                            .build()
                    )
                    .build()
            )

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.store().order()

        val orderFuture = orderServiceAsync.retrieve(0L)

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.store().order()

        val future = orderServiceAsync.delete(0L)

        val response = future.get()
    }
}
