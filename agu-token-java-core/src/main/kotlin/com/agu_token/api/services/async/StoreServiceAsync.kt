// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.models.store.StoreListInventoryParams
import com.agu_token.api.models.store.StoreListInventoryResponse
import com.agu_token.api.services.async.store.OrderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StoreServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StoreServiceAsync

    fun order(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    fun listInventory(): CompletableFuture<StoreListInventoryResponse> =
        listInventory(StoreListInventoryParams.none())

    /** @see [listInventory] */
    fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StoreListInventoryResponse>

    /** @see [listInventory] */
    fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none()
    ): CompletableFuture<StoreListInventoryResponse> = listInventory(params, RequestOptions.none())

    /** @see [listInventory] */
    fun listInventory(
        requestOptions: RequestOptions
    ): CompletableFuture<StoreListInventoryResponse> =
        listInventory(StoreListInventoryParams.none(), requestOptions)

    /** A view of [StoreServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StoreServiceAsync.WithRawResponse

        fun order(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/inventory`, but is otherwise the same as
         * [StoreServiceAsync.listInventory].
         */
        fun listInventory(): CompletableFuture<HttpResponseFor<StoreListInventoryResponse>> =
            listInventory(StoreListInventoryParams.none())

        /** @see [listInventory] */
        fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StoreListInventoryResponse>>

        /** @see [listInventory] */
        fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none()
        ): CompletableFuture<HttpResponseFor<StoreListInventoryResponse>> =
            listInventory(params, RequestOptions.none())

        /** @see [listInventory] */
        fun listInventory(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StoreListInventoryResponse>> =
            listInventory(StoreListInventoryParams.none(), requestOptions)
    }
}
