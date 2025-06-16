// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async.store

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.models.Order
import com.agu_token.api.models.store.order.OrderCreateParams
import com.agu_token.api.models.store.order.OrderDeleteParams
import com.agu_token.api.models.store.order.OrderRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderServiceAsync

    /** Place a new order in the store */
    fun create(): CompletableFuture<Order> = create(OrderCreateParams.none())

    /** @see [create] */
    fun create(
        params: OrderCreateParams = OrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Order>

    /** @see [create] */
    fun create(params: OrderCreateParams = OrderCreateParams.none()): CompletableFuture<Order> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<Order> =
        create(OrderCreateParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    fun retrieve(orderId: Long): CompletableFuture<Order> =
        retrieve(orderId, OrderRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        orderId: Long,
        params: OrderRetrieveParams = OrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Order> =
        retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        orderId: Long,
        params: OrderRetrieveParams = OrderRetrieveParams.none(),
    ): CompletableFuture<Order> = retrieve(orderId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Order>

    /** @see [retrieve] */
    fun retrieve(params: OrderRetrieveParams): CompletableFuture<Order> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(orderId: Long, requestOptions: RequestOptions): CompletableFuture<Order> =
        retrieve(orderId, OrderRetrieveParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    fun delete(orderId: Long): CompletableFuture<Void?> = delete(orderId, OrderDeleteParams.none())

    /** @see [delete] */
    fun delete(
        orderId: Long,
        params: OrderDeleteParams = OrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        orderId: Long,
        params: OrderDeleteParams = OrderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(orderId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: OrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: OrderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(orderId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(orderId, OrderDeleteParams.none(), requestOptions)

    /** A view of [OrderServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /store/order`, but is otherwise the same as
         * [OrderServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<Order>> = create(OrderCreateParams.none())

        /** @see [create] */
        fun create(
            params: OrderCreateParams = OrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Order>>

        /** @see [create] */
        fun create(
            params: OrderCreateParams = OrderCreateParams.none()
        ): CompletableFuture<HttpResponseFor<Order>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Order>> =
            create(OrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/order/{orderId}`, but is otherwise the same
         * as [OrderServiceAsync.retrieve].
         */
        fun retrieve(orderId: Long): CompletableFuture<HttpResponseFor<Order>> =
            retrieve(orderId, OrderRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            orderId: Long,
            params: OrderRetrieveParams = OrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Order>> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            orderId: Long,
            params: OrderRetrieveParams = OrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Order>> =
            retrieve(orderId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: OrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Order>>

        /** @see [retrieve] */
        fun retrieve(params: OrderRetrieveParams): CompletableFuture<HttpResponseFor<Order>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            orderId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Order>> =
            retrieve(orderId, OrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /store/order/{orderId}`, but is otherwise the
         * same as [OrderServiceAsync.delete].
         */
        fun delete(orderId: Long): CompletableFuture<HttpResponse> =
            delete(orderId, OrderDeleteParams.none())

        /** @see [delete] */
        fun delete(
            orderId: Long,
            params: OrderDeleteParams = OrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            orderId: Long,
            params: OrderDeleteParams = OrderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(orderId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        fun delete(params: OrderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(orderId: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(orderId, OrderDeleteParams.none(), requestOptions)
    }
}
