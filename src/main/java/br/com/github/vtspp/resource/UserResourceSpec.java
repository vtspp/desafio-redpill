package br.com.github.vtspp.resource;

import br.com.github.vtspp.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface UserResourceSpec extends Serializable {

    String PATH = "v1/api/user-manager";

    @PostMapping
    @ApiOperation(value = "Manager user data")
    @ApiResponses(value = {
    @ApiResponse(code = 200, message = "User Registered Successfully"),
    @ApiResponse(code = 401, message = "Check the data sent"),
    @ApiResponse(code = 500, message = "Error during management ")})
    ResponseEntity<UserDTO> register (@RequestBody  UserDTO dto);
}