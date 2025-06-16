// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.JsonValue
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.checkRequired
import com.agu_token.api.core.handlers.emptyHandler
import com.agu_token.api.core.handlers.errorHandler
import com.agu_token.api.core.handlers.jsonHandler
import com.agu_token.api.core.handlers.withErrorHandler
import com.agu_token.api.core.http.HttpMethod
import com.agu_token.api.core.http.HttpRequest
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponse.Handler
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.core.http.json
import com.agu_token.api.core.http.parseable
import com.agu_token.api.core.prepareAsync
import com.agu_token.api.models.pet.Pet
import com.agu_token.api.models.pet.PetCreateParams
import com.agu_token.api.models.pet.PetDeleteParams
import com.agu_token.api.models.pet.PetFindByStatusParams
import com.agu_token.api.models.pet.PetFindByTagsParams
import com.agu_token.api.models.pet.PetRetrieveParams
import com.agu_token.api.models.pet.PetUpdateByIdParams
import com.agu_token.api.models.pet.PetUpdateParams
import com.agu_token.api.models.pet.PetUploadImageParams
import com.agu_token.api.models.pet.PetUploadImageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PetServiceAsync {

    private val withRawResponse: PetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PetServiceAsync =
        PetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pet> =
        // post /pet
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pet> =
        // get /pet/{petId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pet> =
        // put /pet
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /pet/{petId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun findByStatus(
        params: PetFindByStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Pet>> =
        // get /pet/findByStatus
        withRawResponse().findByStatus(params, requestOptions).thenApply { it.parse() }

    override fun findByTags(
        params: PetFindByTagsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Pet>> =
        // get /pet/findByTags
        withRawResponse().findByTags(params, requestOptions).thenApply { it.parse() }

    override fun updateById(
        params: PetUpdateByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /pet/{petId}
        withRawResponse().updateById(params, requestOptions).thenAccept {}

    override fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PetUploadImageResponse> =
        // post /pet/{petId}/uploadImage
        withRawResponse().uploadImage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PetServiceAsync.WithRawResponse =
            PetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Pet> =
            jsonHandler<Pet>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Pet> =
            jsonHandler<Pet>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pet>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Pet> =
            jsonHandler<Pet>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }

        private val findByStatusHandler: Handler<List<Pet>> =
            jsonHandler<List<Pet>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun findByStatus(
            params: PetFindByStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Pet>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "findByStatus")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { findByStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val findByTagsHandler: Handler<List<Pet>> =
            jsonHandler<List<Pet>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun findByTags(
            params: PetFindByTagsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Pet>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "findByTags")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { findByTagsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val updateByIdHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun updateById(
            params: PetUpdateByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { updateByIdHandler.handle(it) } }
                }
        }

        private val uploadImageHandler: Handler<PetUploadImageResponse> =
            jsonHandler<PetUploadImageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0), "uploadImage")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { uploadImageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
