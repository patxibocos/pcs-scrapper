//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: race.proto

package io.github.patxibocos.pcsscraper.protobuf;

@kotlin.jvm.JvmSynthetic
inline fun races(block: io.github.patxibocos.pcsscraper.protobuf.RacesKt.Dsl.() -> Unit): io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races =
  io.github.patxibocos.pcsscraper.protobuf.RacesKt.Dsl._create(io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races.newBuilder()).apply { block() }._build()
object RacesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class RacesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     */
     val races: com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRacesList()
      )
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     * @param value The races to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRaces")
    fun com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>.add(value: io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race) {
      _builder.addRaces(value)
    }/**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     * @param value The races to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRaces")
    inline operator fun com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>.plusAssign(value: io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race) {
      add(value)
    }/**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     * @param values The races to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRaces")
    fun com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>.addAll(values: kotlin.collections.Iterable<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race>) {
      _builder.addAllRaces(values)
    }/**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     * @param values The races to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRaces")
    inline operator fun com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>.plusAssign(values: kotlin.collections.Iterable<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race>) {
      addAll(values)
    }/**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     * @param index The index to set the value at.
     * @param value The races to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRaces")
    operator fun com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>.set(index: kotlin.Int, value: io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race) {
      _builder.setRaces(index, value)
    }/**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.Race races = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRaces")
    fun com.google.protobuf.kotlin.DslList<io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Race, RacesProxy>.clear() {
      _builder.clearRaces()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races.copy(block: io.github.patxibocos.pcsscraper.protobuf.RacesKt.Dsl.() -> Unit): io.github.patxibocos.pcsscraper.protobuf.RaceOuterClass.Races =
  io.github.patxibocos.pcsscraper.protobuf.RacesKt.Dsl._create(this.toBuilder()).apply { block() }._build()
