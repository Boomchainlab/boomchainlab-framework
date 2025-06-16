// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models

import com.agu_token.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val order =
            Order.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Order.Status.APPROVED)
                .build()

        assertThat(order.id()).contains(10L)
        assertThat(order.complete()).contains(true)
        assertThat(order.petId()).contains(198772L)
        assertThat(order.quantity()).contains(7)
        assertThat(order.shipDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(order.status()).contains(Order.Status.APPROVED)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val order =
            Order.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Order.Status.APPROVED)
                .build()

        val roundtrippedOrder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(order), jacksonTypeRef<Order>())

        assertThat(roundtrippedOrder).isEqualTo(order)
    }
}
