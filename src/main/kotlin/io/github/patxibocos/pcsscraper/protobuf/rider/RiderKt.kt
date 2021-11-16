//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: src/main/proto/rider.proto

package io.github.patxibocos.pcsscraper.protobuf.rider;

@kotlin.jvm.JvmSynthetic
inline fun rider(block: io.github.patxibocos.pcsscraper.protobuf.rider.RiderKt.Dsl.() -> Unit): io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider =
  io.github.patxibocos.pcsscraper.protobuf.rider.RiderKt.Dsl._create(io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.newBuilder()).apply { block() }._build()
object RiderKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider = _builder.build()

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
     * <code>string first_name = 2;</code>
     */
    var firstName: kotlin.String
      @JvmName("getFirstName")
      get() = _builder.getFirstName()
      @JvmName("setFirstName")
      set(value) {
        _builder.setFirstName(value)
      }
    /**
     * <code>string first_name = 2;</code>
     */
    fun clearFirstName() {
      _builder.clearFirstName()
    }

    /**
     * <code>string last_name = 3;</code>
     */
    var lastName: kotlin.String
      @JvmName("getLastName")
      get() = _builder.getLastName()
      @JvmName("setLastName")
      set(value) {
        _builder.setLastName(value)
      }
    /**
     * <code>string last_name = 3;</code>
     */
    fun clearLastName() {
      _builder.clearLastName()
    }

    /**
     * <code>string country = 4;</code>
     */
    var country: kotlin.String
      @JvmName("getCountry")
      get() = _builder.getCountry()
      @JvmName("setCountry")
      set(value) {
        _builder.setCountry(value)
      }
    /**
     * <code>string country = 4;</code>
     */
    fun clearCountry() {
      _builder.clearCountry()
    }

    /**
     * <code>optional .google.protobuf.Timestamp birth_date = 5;</code>
     */
    var birthDate: com.google.protobuf.Timestamp
      @JvmName("getBirthDate")
      get() = _builder.getBirthDate()
      @JvmName("setBirthDate")
      set(value) {
        _builder.setBirthDate(value)
      }
    /**
     * <code>optional .google.protobuf.Timestamp birth_date = 5;</code>
     */
    fun clearBirthDate() {
      _builder.clearBirthDate()
    }
    /**
     * <code>optional .google.protobuf.Timestamp birth_date = 5;</code>
     * @return Whether the birthDate field is set.
     */
    fun hasBirthDate(): kotlin.Boolean {
      return _builder.hasBirthDate()
    }

    /**
     * <code>string photo = 6;</code>
     */
    var photo: kotlin.String
      @JvmName("getPhoto")
      get() = _builder.getPhoto()
      @JvmName("setPhoto")
      set(value) {
        _builder.setPhoto(value)
      }
    /**
     * <code>string photo = 6;</code>
     */
    fun clearPhoto() {
      _builder.clearPhoto()
    }

    /**
     * <code>optional string website = 7;</code>
     */
    var website: kotlin.String
      @JvmName("getWebsite")
      get() = _builder.getWebsite()
      @JvmName("setWebsite")
      set(value) {
        _builder.setWebsite(value)
      }
    /**
     * <code>optional string website = 7;</code>
     */
    fun clearWebsite() {
      _builder.clearWebsite()
    }
    /**
     * <code>optional string website = 7;</code>
     * @return Whether the website field is set.
     */
    fun hasWebsite(): kotlin.Boolean {
      return _builder.hasWebsite()
    }

    /**
     * <code>optional string birth_place = 8;</code>
     */
    var birthPlace: kotlin.String
      @JvmName("getBirthPlace")
      get() = _builder.getBirthPlace()
      @JvmName("setBirthPlace")
      set(value) {
        _builder.setBirthPlace(value)
      }
    /**
     * <code>optional string birth_place = 8;</code>
     */
    fun clearBirthPlace() {
      _builder.clearBirthPlace()
    }
    /**
     * <code>optional string birth_place = 8;</code>
     * @return Whether the birthPlace field is set.
     */
    fun hasBirthPlace(): kotlin.Boolean {
      return _builder.hasBirthPlace()
    }

    /**
     * <code>optional uint32 weight = 9;</code>
     */
    var weight: kotlin.Int
      @JvmName("getWeight")
      get() = _builder.getWeight()
      @JvmName("setWeight")
      set(value) {
        _builder.setWeight(value)
      }
    /**
     * <code>optional uint32 weight = 9;</code>
     */
    fun clearWeight() {
      _builder.clearWeight()
    }
    /**
     * <code>optional uint32 weight = 9;</code>
     * @return Whether the weight field is set.
     */
    fun hasWeight(): kotlin.Boolean {
      return _builder.hasWeight()
    }

    /**
     * <code>optional uint32 height = 10;</code>
     */
    var height: kotlin.Int
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>optional uint32 height = 10;</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }
    /**
     * <code>optional uint32 height = 10;</code>
     * @return Whether the height field is set.
     */
    fun hasHeight(): kotlin.Boolean {
      return _builder.hasHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.copy(block: io.github.patxibocos.pcsscraper.protobuf.rider.RiderKt.Dsl.() -> Unit): io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider =
  io.github.patxibocos.pcsscraper.protobuf.rider.RiderKt.Dsl._create(this.toBuilder()).apply { block() }._build()
