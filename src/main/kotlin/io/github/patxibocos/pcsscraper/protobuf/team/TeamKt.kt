//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: src/main/proto/team.proto

package io.github.patxibocos.pcsscraper.protobuf.team;

@kotlin.jvm.JvmSynthetic
inline fun team(block: io.github.patxibocos.pcsscraper.protobuf.team.TeamKt.Dsl.() -> Unit): io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team =
  io.github.patxibocos.pcsscraper.protobuf.team.TeamKt.Dsl._create(io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team.newBuilder()).apply { block() }._build()
object TeamKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team = _builder.build()

    /**
     * <code>string id = 1;</code>
     */
    var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1;</code>
     */
    fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string name = 2;</code>
     */
    var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 2;</code>
     */
    fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>.io.github.patxibocos.pcsscraper.protobuf.team.Team.Status status = 3;</code>
     */
    var status: io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team.Status
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <code>.io.github.patxibocos.pcsscraper.protobuf.team.Team.Status status = 3;</code>
     */
    fun clearStatus() {
      _builder.clearStatus()
    }

    /**
     * <code>string abbreviation = 4;</code>
     */
    var abbreviation: kotlin.String
      @JvmName("getAbbreviation")
      get() = _builder.getAbbreviation()
      @JvmName("setAbbreviation")
      set(value) {
        _builder.setAbbreviation(value)
      }
    /**
     * <code>string abbreviation = 4;</code>
     */
    fun clearAbbreviation() {
      _builder.clearAbbreviation()
    }

    /**
     * <code>string country = 5;</code>
     */
    var country: kotlin.String
      @JvmName("getCountry")
      get() = _builder.getCountry()
      @JvmName("setCountry")
      set(value) {
        _builder.setCountry(value)
      }
    /**
     * <code>string country = 5;</code>
     */
    fun clearCountry() {
      _builder.clearCountry()
    }

    /**
     * <code>string bike = 6;</code>
     */
    var bike: kotlin.String
      @JvmName("getBike")
      get() = _builder.getBike()
      @JvmName("setBike")
      set(value) {
        _builder.setBike(value)
      }
    /**
     * <code>string bike = 6;</code>
     */
    fun clearBike() {
      _builder.clearBike()
    }

    /**
     * <code>string jersey = 7;</code>
     */
    var jersey: kotlin.String
      @JvmName("getJersey")
      get() = _builder.getJersey()
      @JvmName("setJersey")
      set(value) {
        _builder.setJersey(value)
      }
    /**
     * <code>string jersey = 7;</code>
     */
    fun clearJersey() {
      _builder.clearJersey()
    }

    /**
     * <code>uint32 year = 8;</code>
     */
    var year: kotlin.Int
      @JvmName("getYear")
      get() = _builder.getYear()
      @JvmName("setYear")
      set(value) {
        _builder.setYear(value)
      }
    /**
     * <code>uint32 year = 8;</code>
     */
    fun clearYear() {
      _builder.clearYear()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class RiderIdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string rider_ids = 9;</code>
     * @return A list containing the riderIds.
     */
    val riderIds: com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRiderIdsList()
      )
    /**
     * <code>repeated string rider_ids = 9;</code>
     * @param value The riderIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRiderIds")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>.add(value: kotlin.String) {
      _builder.addRiderIds(value)
    }
    /**
     * <code>repeated string rider_ids = 9;</code>
     * @param value The riderIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRiderIds")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>.plusAssign(value: kotlin.String) {
      _builder.addRiderIds(value)
    }
    /**
     * <code>repeated string rider_ids = 9;</code>
     * @param values The riderIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRiderIds")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllRiderIds(values)
    }
    /**
     * <code>repeated string rider_ids = 9;</code>
     * @param values The riderIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRiderIds")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllRiderIds(values)
    }
    /**
     * <code>repeated string rider_ids = 9;</code>
     * @param index The index to set the value at.
     * @param value The riderIds to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRiderIds")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setRiderIds(index, value)
    }/**
     * <code>repeated string rider_ids = 9;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRiderIds")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, RiderIdsProxy>.clear() {
      _builder.clearRiderIds()
    }
    /**
     * <code>string website = 10;</code>
     */
    var website: kotlin.String
      @JvmName("getWebsite")
      get() = _builder.getWebsite()
      @JvmName("setWebsite")
      set(value) {
        _builder.setWebsite(value)
      }
    /**
     * <code>string website = 10;</code>
     */
    fun clearWebsite() {
      _builder.clearWebsite()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team.copy(block: io.github.patxibocos.pcsscraper.protobuf.team.TeamKt.Dsl.() -> Unit): io.github.patxibocos.pcsscraper.protobuf.team.TeamOuterClass.Team =
  io.github.patxibocos.pcsscraper.protobuf.team.TeamKt.Dsl._create(this.toBuilder()).apply { block() }._build()
