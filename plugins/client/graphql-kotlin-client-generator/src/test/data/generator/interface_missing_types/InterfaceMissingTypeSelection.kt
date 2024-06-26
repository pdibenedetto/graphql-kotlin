package com.expediagroup.graphql.generated

import com.expediagroup.graphql.client.Generated
import com.expediagroup.graphql.client.types.GraphQLClientRequest
import com.expediagroup.graphql.generated.interfacemissingtypeselection.BasicInterface
import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.reflect.KClass

public const val INTERFACE_MISSING_TYPE_SELECTION: String =
    "query InterfaceMissingTypeSelection {\n  interfaceQuery {\n    __typename\n    id\n    name\n    ... on FirstInterfaceImplementation {\n      intValue\n    }\n  }\n}"

@Generated
public class InterfaceMissingTypeSelection :
    GraphQLClientRequest<InterfaceMissingTypeSelection.Result> {
  override val query: String = INTERFACE_MISSING_TYPE_SELECTION

  override val operationName: String = "InterfaceMissingTypeSelection"

  override fun responseType(): KClass<InterfaceMissingTypeSelection.Result> =
      InterfaceMissingTypeSelection.Result::class

  @Generated
  public data class Result(
    /**
     * Query returning an interface
     */
    @get:JsonProperty(value = "interfaceQuery")
    public val interfaceQuery: BasicInterface,
  )
}
