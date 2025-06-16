// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.TestServerExtension
import com.agu_token.api.client.okhttp.AguTokenOkHttpClientAsync
import com.agu_token.api.models.pet.Category
import com.agu_token.api.models.pet.Pet
import com.agu_token.api.models.pet.PetCreateParams
import com.agu_token.api.models.pet.PetFindByStatusParams
import com.agu_token.api.models.pet.PetFindByTagsParams
import com.agu_token.api.models.pet.PetUpdateByIdParams
import com.agu_token.api.models.pet.PetUpdateParams
import com.agu_token.api.models.pet.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PetServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val petFuture =
            petServiceAsync.create(
                PetCreateParams.builder()
                    .pet(
                        Pet.builder()
                            .name("doggie")
                            .addPhotoUrl("string")
                            .id(10L)
                            .category(Category.builder().id(1L).name("Dogs").build())
                            .status(Pet.Status.AVAILABLE)
                            .addTag(Pet.Tag.builder().id(0L).name("name").build())
                            .build()
                    )
                    .build()
            )

        val pet = petFuture.get()
        pet.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val petFuture = petServiceAsync.retrieve(0L)

        val pet = petFuture.get()
        pet.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val petFuture =
            petServiceAsync.update(
                PetUpdateParams.builder()
                    .pet(
                        Pet.builder()
                            .name("doggie")
                            .addPhotoUrl("string")
                            .id(10L)
                            .category(Category.builder().id(1L).name("Dogs").build())
                            .status(Pet.Status.AVAILABLE)
                            .addTag(Pet.Tag.builder().id(0L).name("name").build())
                            .build()
                    )
                    .build()
            )

        val pet = petFuture.get()
        pet.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val future = petServiceAsync.delete(0L)

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun findByStatus() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val petsFuture =
            petServiceAsync.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        val pets = petsFuture.get()
        pets.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun findByTags() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val petsFuture =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        val pets = petsFuture.get()
        pets.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun updateById() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val future =
            petServiceAsync.updateById(
                PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
            )

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun uploadImage() {
        val client =
            AguTokenOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val responseFuture =
            petServiceAsync.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("some content")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
