// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.simple_fragment.fragment

import com.apollographql.apollo.api.Fragment
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.example.simple_fragment.fragment.adapter.HeroDetailsImpl_ResponseAdapter
import kotlin.String

internal class HeroDetailsImpl : Fragment<HeroDetailsImpl.Data> {
  override fun adapter(): ResponseAdapter<Data> {
    return HeroDetailsImpl_ResponseAdapter
  }

  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  /**
   * A character from the Star Wars universe
   */
  interface Data : HeroDetail, Fragment.Data {
    override val __typename: String

    data class HumanDatum(
      override val __typename: String,
      /**
       * What this human calls themselves
       */
      override val name: String
    ) : HeroDetail, HeroDetail.Human, HumanDetail, Data

    data class OtherDatum(
      override val __typename: String
    ) : HeroDetail, Data
  }
}