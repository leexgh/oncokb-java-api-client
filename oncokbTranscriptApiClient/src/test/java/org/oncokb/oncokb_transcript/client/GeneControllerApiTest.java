/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.oncokb.oncokb_transcript.client;

import org.oncokb.oncokb_transcript.ApiException;
import org.oncokb.oncokb_transcript.client.Gene;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneControllerApi
 */
@Ignore
public class GeneControllerApiTest {

    private final GeneControllerApi api = new GeneControllerApi();

    /**
     * findGeneBySymbol
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findGeneBySymbolUsingGETTest() throws ApiException {
        String symbol = null;
        Gene response = api.findGeneBySymbolUsingGET(symbol);

        // TODO: test validations
    }
    /**
     * findGenesBySymbols
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findGenesBySymbolsUsingPOSTTest() throws ApiException {
        List<String> body = null;
        List<Gene> response = api.findGenesBySymbolsUsingPOST(body);

        // TODO: test validations
    }
}
