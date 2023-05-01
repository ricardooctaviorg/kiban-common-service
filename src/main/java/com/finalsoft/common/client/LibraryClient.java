package com.finalsoft.common.client;

import java.util.List;

import com.finalsoft.common.domain.mapstruct.BookDto;
import com.finalsoft.common.domain.model.FormularioBuro;
import com.finalsoft.common.domain.model.LibResponse;
import com.finalsoft.common.domain.model.RespuestaBuro;
import com.finalsoft.common.domain.model.RespuestaBuroScore;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface LibraryClient {

    @Headers({"Content-Type: application/json","company_code: neYDCMX","api_key: d5c45c9e-2ee1-4e05-9efb-21f09ae0bd0c"})
    @POST("/workfloo/api/v1/workfloo")
    Call<RespuestaBuro> iniciarWorkfloo(@Body FormularioBuro formulario);

    @Headers({"Content-Type: application/json","company_code: neYDCMX","api_key: d5c45c9e-2ee1-4e05-9efb-21f09ae0bd0c"})
    @POST("/workfloo/api/v1/form")
    Call<RespuestaBuro> enviarFormulario(@Body FormularioBuro formulario);

    @Headers({"Content-Type: application/json","company_code: neYDCMX","api_key: d5c45c9e-2ee1-4e05-9efb-21f09ae0bd0c"})
    @POST("/workfloo/api/v2/nip/createCuenta")
    Call<RespuestaBuro> crearcuenta(@Body FormularioBuro formulario);

    @Headers({"Content-Type: application/json","company_code: neYDCMX","api_key: d5c45c9e-2ee1-4e05-9efb-21f09ae0bd0c"})
    @GET("/workfloo/api/v2/workfloo/{idUnykoo}")
    Call<RespuestaBuroScore> obtenerScoreBuro(@Path("idUnykoo") String idUnykoo);

    @GET("/library/managed/books")
    Call<List<BookDto>> getAllBooks(@retrofit2.http.Query("type") String type);

    @GET("/library/managed/books/{requestId}")
    Call<BookDto> getAllBooksWithHeaders(@Header("requestId") String requestId);

    @PUT("/library/managed/books/{id}")
    Call<LibResponse> updateBook(@Path("id") Long id, @Body BookDto book);

    @DELETE("/library/managed/books/{id}")
    Call<LibResponse> deleteBook(@Path("id") Long id);
}
