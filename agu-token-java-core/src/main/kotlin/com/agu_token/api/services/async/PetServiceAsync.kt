// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponseFor
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

interface PetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PetServiceAsync

    /** Add a new pet to the store */
    fun create(params: PetCreateParams): CompletableFuture<Pet> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet>

    /** Returns a single pet */
    fun retrieve(petId: Long): CompletableFuture<Pet> = retrieve(petId, PetRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet> = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
    ): CompletableFuture<Pet> = retrieve(petId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet>

    /** @see [retrieve] */
    fun retrieve(params: PetRetrieveParams): CompletableFuture<Pet> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(petId: Long, requestOptions: RequestOptions): CompletableFuture<Pet> =
        retrieve(petId, PetRetrieveParams.none(), requestOptions)

    /** Update an existing pet by Id */
    fun update(params: PetUpdateParams): CompletableFuture<Pet> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet>

    /** delete a pet */
    fun delete(petId: Long): CompletableFuture<Void?> = delete(petId, PetDeleteParams.none())

    /** @see [delete] */
    fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(petId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: PetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(petId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(petId, PetDeleteParams.none(), requestOptions)

    /** Multiple status values can be provided with comma separated strings */
    fun findByStatus(): CompletableFuture<List<Pet>> = findByStatus(PetFindByStatusParams.none())

    /** @see [findByStatus] */
    fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Pet>>

    /** @see [findByStatus] */
    fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none()
    ): CompletableFuture<List<Pet>> = findByStatus(params, RequestOptions.none())

    /** @see [findByStatus] */
    fun findByStatus(requestOptions: RequestOptions): CompletableFuture<List<Pet>> =
        findByStatus(PetFindByStatusParams.none(), requestOptions)

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    fun findByTags(): CompletableFuture<List<Pet>> = findByTags(PetFindByTagsParams.none())

    /** @see [findByTags] */
    fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Pet>>

    /** @see [findByTags] */
    fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none()
    ): CompletableFuture<List<Pet>> = findByTags(params, RequestOptions.none())

    /** @see [findByTags] */
    fun findByTags(requestOptions: RequestOptions): CompletableFuture<List<Pet>> =
        findByTags(PetFindByTagsParams.none(), requestOptions)

    /** Updates a pet in the store with form data */
    fun updateById(petId: Long): CompletableFuture<Void?> =
        updateById(petId, PetUpdateByIdParams.none())

    /** @see [updateById] */
    fun updateById(
        petId: Long,
        params: PetUpdateByIdParams = PetUpdateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateById(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [updateById] */
    fun updateById(
        petId: Long,
        params: PetUpdateByIdParams = PetUpdateByIdParams.none(),
    ): CompletableFuture<Void?> = updateById(petId, params, RequestOptions.none())

    /** @see [updateById] */
    fun updateById(
        params: PetUpdateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [updateById] */
    fun updateById(params: PetUpdateByIdParams): CompletableFuture<Void?> =
        updateById(params, RequestOptions.none())

    /** @see [updateById] */
    fun updateById(petId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        updateById(petId, PetUpdateByIdParams.none(), requestOptions)

    /** uploads an image */
    fun uploadImage(petId: Long): CompletableFuture<PetUploadImageResponse> =
        uploadImage(petId, PetUploadImageParams.none())

    /** @see [uploadImage] */
    fun uploadImage(
        petId: Long,
        params: PetUploadImageParams = PetUploadImageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PetUploadImageResponse> =
        uploadImage(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [uploadImage] */
    fun uploadImage(
        petId: Long,
        params: PetUploadImageParams = PetUploadImageParams.none(),
    ): CompletableFuture<PetUploadImageResponse> = uploadImage(petId, params, RequestOptions.none())

    /** @see [uploadImage] */
    fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PetUploadImageResponse>

    /** @see [uploadImage] */
    fun uploadImage(params: PetUploadImageParams): CompletableFuture<PetUploadImageResponse> =
        uploadImage(params, RequestOptions.none())

    /** @see [uploadImage] */
    fun uploadImage(
        petId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PetUploadImageResponse> =
        uploadImage(petId, PetUploadImageParams.none(), requestOptions)

    /** A view of [PetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pet`, but is otherwise the same as
         * [PetServiceAsync.create].
         */
        fun create(params: PetCreateParams): CompletableFuture<HttpResponseFor<Pet>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>>

        /**
         * Returns a raw HTTP response for `get /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.retrieve].
         */
        fun retrieve(petId: Long): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(petId, PetRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Pet>> = retrieve(petId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>>

        /** @see [retrieve] */
        fun retrieve(params: PetRetrieveParams): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            petId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(petId, PetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /pet`, but is otherwise the same as
         * [PetServiceAsync.update].
         */
        fun update(params: PetUpdateParams): CompletableFuture<HttpResponseFor<Pet>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>>

        /**
         * Returns a raw HTTP response for `delete /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.delete].
         */
        fun delete(petId: Long): CompletableFuture<HttpResponse> =
            delete(petId, PetDeleteParams.none())

        /** @see [delete] */
        fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(petId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        fun delete(params: PetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(petId: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(petId, PetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByStatus`, but is otherwise the same as
         * [PetServiceAsync.findByStatus].
         */
        fun findByStatus(): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByStatus(PetFindByStatusParams.none())

        /** @see [findByStatus] */
        fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Pet>>>

        /** @see [findByStatus] */
        fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none()
        ): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByStatus(params, RequestOptions.none())

        /** @see [findByStatus] */
        fun findByStatus(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByStatus(PetFindByStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByTags`, but is otherwise the same as
         * [PetServiceAsync.findByTags].
         */
        fun findByTags(): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByTags(PetFindByTagsParams.none())

        /** @see [findByTags] */
        fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Pet>>>

        /** @see [findByTags] */
        fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none()
        ): CompletableFuture<HttpResponseFor<List<Pet>>> = findByTags(params, RequestOptions.none())

        /** @see [findByTags] */
        fun findByTags(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByTags(PetFindByTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.updateById].
         */
        fun updateById(petId: Long): CompletableFuture<HttpResponse> =
            updateById(petId, PetUpdateByIdParams.none())

        /** @see [updateById] */
        fun updateById(
            petId: Long,
            params: PetUpdateByIdParams = PetUpdateByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateById(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [updateById] */
        fun updateById(
            petId: Long,
            params: PetUpdateByIdParams = PetUpdateByIdParams.none(),
        ): CompletableFuture<HttpResponse> = updateById(petId, params, RequestOptions.none())

        /** @see [updateById] */
        fun updateById(
            params: PetUpdateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [updateById] */
        fun updateById(params: PetUpdateByIdParams): CompletableFuture<HttpResponse> =
            updateById(params, RequestOptions.none())

        /** @see [updateById] */
        fun updateById(
            petId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            updateById(petId, PetUpdateByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}/uploadImage`, but is otherwise the
         * same as [PetServiceAsync.uploadImage].
         */
        fun uploadImage(petId: Long): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(petId, PetUploadImageParams.none())

        /** @see [uploadImage] */
        fun uploadImage(
            petId: Long,
            params: PetUploadImageParams = PetUploadImageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [uploadImage] */
        fun uploadImage(
            petId: Long,
            params: PetUploadImageParams = PetUploadImageParams.none(),
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(petId, params, RequestOptions.none())

        /** @see [uploadImage] */
        fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>>

        /** @see [uploadImage] */
        fun uploadImage(
            params: PetUploadImageParams
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(params, RequestOptions.none())

        /** @see [uploadImage] */
        fun uploadImage(
            petId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(petId, PetUploadImageParams.none(), requestOptions)
    }
}
