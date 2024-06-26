package com.expediagroup.graphql.generated

import com.expediagroup.graphql.client.Generated
import com.expediagroup.graphql.client.types.GraphQLClientRequest
import com.expediagroup.graphql.generated.differentselectionsetquery.BasicUnion
import com.expediagroup.graphql.generated.differentselectionsetquery.ComplexObject2
import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.reflect.KClass

public const val DIFFERENT_SELECTION_SET_QUERY: String =
    "query DifferentSelectionSetQuery {\n  unionQuery {\n    __typename\n    ... on BasicObject {\n      id\n      name\n    }\n    ... on ComplexObject {\n      id\n      name\n      optional\n    }\n  }\n  complexObjectQuery {\n    id\n    name\n    details {\n      value\n    }\n  }\n}"

@Generated
public class DifferentSelectionSetQuery : GraphQLClientRequest<DifferentSelectionSetQuery.Result> {
  override val query: String = DIFFERENT_SELECTION_SET_QUERY

  override val operationName: String = "DifferentSelectionSetQuery"

  override fun responseType(): KClass<DifferentSelectionSetQuery.Result> =
      DifferentSelectionSetQuery.Result::class

  @Generated
  public data class Result(
    /**
     * Query returning union
     */
    @get:JsonProperty(value = "unionQuery")
    public val unionQuery: BasicUnion,
    /**
     * Query returning an object that references another object
     */
    @get:JsonProperty(value = "complexObjectQuery")
    public val complexObjectQuery: ComplexObject2,
  )
}
