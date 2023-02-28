#include "JoltPhysicsC.h"

#include <assert.h>
#include <stddef.h>

#include <Jolt/Jolt.h>
#include <Jolt/RegisterTypes.h>
#include <Jolt/Core/Factory.h>
#include <Jolt/Core/TempAllocator.h>
#include <Jolt/Core/Memory.h>
#include <Jolt/Core/JobSystemThreadPool.h>
#include <Jolt/Physics/PhysicsSettings.h>
#include <Jolt/Physics/PhysicsSystem.h>
#include <Jolt/Physics/Collision/NarrowPhaseQuery.h>
#include <Jolt/Physics/Collision/CollideShape.h>
#include <Jolt/Physics/Collision/Shape/BoxShape.h>
#include <Jolt/Physics/Collision/Shape/SphereShape.h>
#include <Jolt/Physics/Collision/Shape/TriangleShape.h>
#include <Jolt/Physics/Collision/Shape/CapsuleShape.h>
#include <Jolt/Physics/Collision/Shape/TaperedCapsuleShape.h>
#include <Jolt/Physics/Collision/Shape/CylinderShape.h>
#include <Jolt/Physics/Collision/Shape/ConvexHullShape.h>
#include <Jolt/Physics/Collision/Shape/HeightFieldShape.h>
#include <Jolt/Physics/Collision/Shape/MeshShape.h>
#include <Jolt/Physics/Collision/PhysicsMaterial.h>
#include <Jolt/Physics/Body/BodyCreationSettings.h>
#include <Jolt/Physics/Body/BodyActivationListener.h>
#include <Jolt/Physics/Body/BodyLock.h>

JPH_SUPPRESS_WARNINGS

#if defined(JPH_EXTERNAL_PROFILE) || defined(JPH_PROFILE_ENABLED)
#error Currently JoltPhysicsC does not support profiling. Please undef JPH_EXTERNAL_PROFILE and JPH_PROFILE_ENABLED.
#endif

#if defined(JPH_TRACK_BROADPHASE_STATS)
#error JPH_TRACK_BROADPHASE_STATS is not supported.
#endif

#define ENSURE_TYPE(o, t) \
    assert(o != nullptr); \
    assert(reinterpret_cast<const JPH::SerializableObject *>(o)->CastTo(JPH_RTTI(t)) != nullptr)

#define FN(name) static auto name

FN(toJph)(JPC_BodyID in) { return JPH::BodyID(in); }
FN(toJpc)(JPH::BodyID in) { return in.GetIndexAndSequenceNumber(); }

FN(toJpc)(const JPH::Body *in) { assert(in); return reinterpret_cast<const JPC_Body *>(in); }
FN(toJph)(const JPC_Body *in) { assert(in); return reinterpret_cast<const JPH::Body *>(in); }
FN(toJpc)(JPH::Body *in) { assert(in); return reinterpret_cast<JPC_Body *>(in); }
FN(toJph)(JPC_Body *in) { assert(in); return reinterpret_cast<JPH::Body *>(in); }

FN(toJph)(const JPC_PhysicsMaterial *in) { return reinterpret_cast<const JPH::PhysicsMaterial *>(in); }
FN(toJpc)(const JPH::PhysicsMaterial *in) { return reinterpret_cast<const JPC_PhysicsMaterial *>(in); }

FN(toJph)(const JPC_ShapeSettings *in) {
    ENSURE_TYPE(in, JPH::ShapeSettings);
    return reinterpret_cast<const JPH::ShapeSettings *>(in);
}
FN(toJph)(JPC_ShapeSettings *in) {
    ENSURE_TYPE(in, JPH::ShapeSettings);
    return reinterpret_cast<JPH::ShapeSettings *>(in);
}
FN(toJpc)(const JPH::ShapeSettings *in) { assert(in); return reinterpret_cast<const JPC_ShapeSettings *>(in); }
FN(toJpc)(JPH::ShapeSettings *in) { assert(in); return reinterpret_cast<JPC_ShapeSettings *>(in); }

FN(toJph)(const JPC_BoxShapeSettings *in) {
    ENSURE_TYPE(in, JPH::BoxShapeSettings);
    return reinterpret_cast<const JPH::BoxShapeSettings *>(in);
}
FN(toJph)(JPC_BoxShapeSettings *in) {
    ENSURE_TYPE(in, JPH::BoxShapeSettings);
    return reinterpret_cast<JPH::BoxShapeSettings *>(in);
}
FN(toJpc)(JPH::BoxShapeSettings *in) { assert(in); return reinterpret_cast<JPC_BoxShapeSettings *>(in); }

FN(toJph)(const JPC_SphereShapeSettings *in) {
    ENSURE_TYPE(in, JPH::SphereShapeSettings);
    return reinterpret_cast<const JPH::SphereShapeSettings *>(in);
}
FN(toJph)(JPC_SphereShapeSettings *in) {
    ENSURE_TYPE(in, JPH::SphereShapeSettings);
    return reinterpret_cast<JPH::SphereShapeSettings *>(in);
}
FN(toJpc)(JPH::SphereShapeSettings *in) { assert(in); return reinterpret_cast<JPC_SphereShapeSettings *>(in); }

FN(toJph)(const JPC_TriangleShapeSettings *in) {
    ENSURE_TYPE(in, JPH::TriangleShapeSettings);
    return reinterpret_cast<const JPH::TriangleShapeSettings *>(in);
}
FN(toJph)(JPC_TriangleShapeSettings *in) {
    ENSURE_TYPE(in, JPH::TriangleShapeSettings);
    return reinterpret_cast<JPH::TriangleShapeSettings *>(in);
}
FN(toJpc)(JPH::TriangleShapeSettings *in) { assert(in); return reinterpret_cast<JPC_TriangleShapeSettings *>(in); }

FN(toJph)(const JPC_CapsuleShapeSettings *in) {
    ENSURE_TYPE(in, JPH::CapsuleShapeSettings);
    return reinterpret_cast<const JPH::CapsuleShapeSettings *>(in);
}
FN(toJph)(JPC_CapsuleShapeSettings *in) {
    ENSURE_TYPE(in, JPH::CapsuleShapeSettings);
    return reinterpret_cast<JPH::CapsuleShapeSettings *>(in);
}
FN(toJpc)(JPH::CapsuleShapeSettings *in) { assert(in); return reinterpret_cast<JPC_CapsuleShapeSettings *>(in); }

FN(toJph)(const JPC_TaperedCapsuleShapeSettings *in) {
    ENSURE_TYPE(in, JPH::TaperedCapsuleShapeSettings);
    return reinterpret_cast<const JPH::TaperedCapsuleShapeSettings *>(in);
}
FN(toJph)(JPC_TaperedCapsuleShapeSettings *in) {
    ENSURE_TYPE(in, JPH::TaperedCapsuleShapeSettings);
    return reinterpret_cast<JPH::TaperedCapsuleShapeSettings *>(in);
}
FN(toJpc)(JPH::TaperedCapsuleShapeSettings *in) {
    assert(in); return reinterpret_cast<JPC_TaperedCapsuleShapeSettings *>(in);
}

FN(toJph)(const JPC_CylinderShapeSettings *in) {
    ENSURE_TYPE(in, JPH::CylinderShapeSettings);
    return reinterpret_cast<const JPH::CylinderShapeSettings *>(in);
}
FN(toJph)(JPC_CylinderShapeSettings *in) {
    ENSURE_TYPE(in, JPH::CylinderShapeSettings);
    return reinterpret_cast<JPH::CylinderShapeSettings *>(in);
}
FN(toJpc)(JPH::CylinderShapeSettings *in) { assert(in); return reinterpret_cast<JPC_CylinderShapeSettings *>(in); }

FN(toJph)(const JPC_ConvexHullShapeSettings *in) {
    ENSURE_TYPE(in, JPH::ConvexHullShapeSettings);
    return reinterpret_cast<const JPH::ConvexHullShapeSettings *>(in);
}
FN(toJph)(JPC_ConvexHullShapeSettings *in) {
    ENSURE_TYPE(in, JPH::ConvexHullShapeSettings);
    return reinterpret_cast<JPH::ConvexHullShapeSettings *>(in);
}
FN(toJpc)(JPH::ConvexHullShapeSettings *in) {
    assert(in);
    return reinterpret_cast<JPC_ConvexHullShapeSettings *>(in);
}

FN(toJph)(const JPC_HeightFieldShapeSettings *in) {
    ENSURE_TYPE(in, JPH::HeightFieldShapeSettings);
    return reinterpret_cast<const JPH::HeightFieldShapeSettings *>(in);
}
FN(toJph)(JPC_HeightFieldShapeSettings *in) {
    ENSURE_TYPE(in, JPH::HeightFieldShapeSettings);
    return reinterpret_cast<JPH::HeightFieldShapeSettings *>(in);
}
FN(toJpc)(JPH::HeightFieldShapeSettings *in) {
    assert(in);
    return reinterpret_cast<JPC_HeightFieldShapeSettings *>(in);
}

FN(toJph)(const JPC_MeshShapeSettings *in) {
    ENSURE_TYPE(in, JPH::MeshShapeSettings);
    return reinterpret_cast<const JPH::MeshShapeSettings *>(in);
}
FN(toJph)(JPC_MeshShapeSettings *in) {
    ENSURE_TYPE(in, JPH::MeshShapeSettings);
    return reinterpret_cast<JPH::MeshShapeSettings *>(in);
}
FN(toJpc)(JPH::MeshShapeSettings *in) {
    assert(in);
    return reinterpret_cast<JPC_MeshShapeSettings *>(in);
}

FN(toJph)(const JPC_ConvexShapeSettings *in) {
    ENSURE_TYPE(in, JPH::ConvexShapeSettings);
    return reinterpret_cast<const JPH::ConvexShapeSettings *>(in);
}
FN(toJph)(JPC_ConvexShapeSettings *in) {
    ENSURE_TYPE(in, JPH::ConvexShapeSettings);
    return reinterpret_cast<JPH::ConvexShapeSettings *>(in);
}

FN(toJph)(const JPC_CollisionGroup *in) { assert(in); return reinterpret_cast<const JPH::CollisionGroup *>(in); }
FN(toJpc)(const JPH::CollisionGroup *in) { assert(in); return reinterpret_cast<const JPC_CollisionGroup *>(in); }
FN(toJpc)(JPH::CollisionGroup *in) { assert(in); return reinterpret_cast<JPC_CollisionGroup *>(in); }

FN(toJph)(const JPC_SubShapeID *in) { assert(in); return reinterpret_cast<const JPH::SubShapeID *>(in); }

FN(toJph)(const JPC_BodyLockInterface *in) {
    assert(in); return reinterpret_cast<const JPH::BodyLockInterface *>(in);
}
FN(toJpc)(const JPH::BodyLockInterface *in) {
    assert(in); return reinterpret_cast<const JPC_BodyLockInterface *>(in);
}

FN(toJpc)(const JPH::NarrowPhaseQuery *in) {
    assert(in); return reinterpret_cast<const JPC_NarrowPhaseQuery *>(in);
}

FN(toJph)(const JPC_PhysicsSystem *in) { assert(in); return reinterpret_cast<const JPH::PhysicsSystem *>(in); }
FN(toJph)(JPC_PhysicsSystem *in) { assert(in); return reinterpret_cast<JPH::PhysicsSystem *>(in); }
FN(toJpc)(JPH::PhysicsSystem *in) { assert(in); return reinterpret_cast<JPC_PhysicsSystem *>(in); }

FN(toJpc)(const JPH::Shape *in) { assert(in); return reinterpret_cast<const JPC_Shape *>(in); }
FN(toJph)(const JPC_Shape *in) { assert(in); return reinterpret_cast<const JPH::Shape *>(in); }
FN(toJpc)(JPH::Shape *in) { assert(in); return reinterpret_cast<JPC_Shape *>(in); }
FN(toJph)(JPC_Shape *in) { assert(in); return reinterpret_cast<JPH::Shape *>(in); }

FN(toJpc)(const JPH::BodyInterface *in) { assert(in); return reinterpret_cast<const JPC_BodyInterface *>(in); }
FN(toJph)(const JPC_BodyInterface *in) { assert(in); return reinterpret_cast<const JPH::BodyInterface *>(in); }
FN(toJpc)(JPH::BodyInterface *in) { assert(in); return reinterpret_cast<JPC_BodyInterface *>(in); }
FN(toJph)(JPC_BodyInterface *in) { assert(in); return reinterpret_cast<JPH::BodyInterface *>(in); }

FN(toJpc)(const JPH::TransformedShape *in) { assert(in); return reinterpret_cast<const JPC_TransformedShape *>(in); }

FN(toJph)(const JPC_MassProperties *in) { assert(in); return reinterpret_cast<const JPH::MassProperties *>(in); }

FN(toJph)(JPC_BodyLockRead *in) { assert(in); return reinterpret_cast<const JPH::BodyLockRead *>(in); }
FN(toJph)(JPC_BodyLockWrite *in) { assert(in); return reinterpret_cast<const JPH::BodyLockWrite *>(in); }

FN(toJpc)(const JPH::BodyCreationSettings *in) {
    assert(in); return reinterpret_cast<const JPC_BodyCreationSettings *>(in);
}
FN(toJph)(const JPC_BodyCreationSettings *in) {
    assert(in); return reinterpret_cast<const JPH::BodyCreationSettings *>(in);
}

FN(toJpc)(const JPH::MotionProperties *in) { assert(in); return reinterpret_cast<const JPC_MotionProperties *>(in); }
FN(toJph)(const JPC_MotionProperties *in) { assert(in); return reinterpret_cast<const JPH::MotionProperties *>(in); }
FN(toJpc)(JPH::MotionProperties *in) { assert(in); return reinterpret_cast<JPC_MotionProperties *>(in); }
FN(toJph)(JPC_MotionProperties *in) { assert(in); return reinterpret_cast<JPH::MotionProperties *>(in); }

FN(toJpc)(const JPH::SubShapeIDPair *in) {
    assert(in); return reinterpret_cast<const JPC_SubShapeIDPair *>(in);
}

FN(toJpc)(const JPH::ContactManifold *in) {
    assert(in); return reinterpret_cast<const JPC_ContactManifold *>(in);
}

FN(toJpc)(const JPH::CollideShapeResult *in) {
    assert(in); return reinterpret_cast<const JPC_CollideShapeResult *>(in);
}

FN(toJpc)(JPH::ContactSettings *in) {
    assert(in); return reinterpret_cast<JPC_ContactSettings *>(in);
}

FN(toJpc)(JPH::BroadPhaseLayer in) { return static_cast<JPC_BroadPhaseLayer>(in); }
FN(toJpc)(JPH::ObjectLayer in) { return static_cast<JPC_ObjectLayer>(in); }
FN(toJpc)(JPH::EShapeType in) { return static_cast<JPC_ShapeType>(in); }
FN(toJpc)(JPH::EShapeSubType in) { return static_cast<JPC_ShapeSubType>(in); }
FN(toJpc)(JPH::EMotionType in) { return static_cast<JPC_MotionType>(in); }
FN(toJpc)(JPH::EActivation in) { return static_cast<JPC_Activation>(in); }
FN(toJpc)(JPH::EMotionQuality in) { return static_cast<JPC_MotionQuality>(in); }

// JoltJava
FN(toJph)(JPC_SphereShape *in) {
    ENSURE_TYPE(in, JPH::SphereShape);
    return reinterpret_cast<JPH::SphereShape *>(in);
}
FN(toJpc)(JPH::SphereShape *in) { assert(in); return reinterpret_cast<JPC_SphereShape *>(in); }
// END JoltJava

#undef FN

static inline JPH::Vec3 loadVec3(const float in[3]) {
    assert(in != nullptr);
    return JPH::Vec3(*reinterpret_cast<const JPH::Float3 *>(in));
}

static inline JPH::Vec4 loadVec4(const float in[4]) {
    assert(in != nullptr);
    return JPH::Vec4::sLoadFloat4(reinterpret_cast<const JPH::Float4 *>(in));
}

static inline JPH::Mat44 loadMat44(const float in[16]) {
    assert(in != nullptr);
    return JPH::Mat44::sLoadFloat4x4(reinterpret_cast<const JPH::Float4 *>(in));
}

static inline JPH::RVec3 loadRVec3(const JPC_Real in[3]) {
    assert(in != nullptr);
#if JPC_DOUBLE_PRECISION == 0
    return JPH::Vec3(*reinterpret_cast<const JPH::Float3 *>(in));
#else
    return JPH::DVec3(in[0], in[1], in[2]);
#endif
}

static inline void storeRVec3(JPC_Real out[3], JPH::RVec3Arg in) {
    assert(out != nullptr);
#if JPC_DOUBLE_PRECISION == 0
    in.StoreFloat3(reinterpret_cast<JPH::Float3 *>(out));
#else
    in.StoreDouble3(reinterpret_cast<JPH::Double3 *>(out));
#endif
}

static inline void storeVec3(float out[3], JPH::Vec3Arg in) {
    assert(out != nullptr);
    in.StoreFloat3(reinterpret_cast<JPH::Float3 *>(out));
}

static inline void storeVec4(float out[4], JPH::Vec4Arg in) {
    assert(out != nullptr);
    in.StoreFloat4(reinterpret_cast<JPH::Float4 *>(out));
}

static inline void storeMat44(float out[16], JPH::Mat44Arg in) {
    assert(out != nullptr);
    in.StoreFloat4x4(reinterpret_cast<JPH::Float4 *>(out));
}

#ifdef JPH_ENABLE_ASSERTS

static bool
AssertFailedImpl(const char *in_expression,
                 const char *in_message,
                 const char *in_file,
                 uint32_t in_line)
{
	return true;
}

#endif
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_RegisterDefaultAllocator(void)
{
    JPH::RegisterDefaultAllocator();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_RegisterCustomAllocator(JPC_AllocateFunction in_alloc,
                            JPC_FreeFunction in_free,
                            JPC_AlignedAllocateFunction in_aligned_alloc,
                            JPC_AlignedFreeFunction in_aligned_free)
{
#ifndef JPH_DISABLE_CUSTOM_ALLOCATOR
    JPH::Allocate = in_alloc;
    JPH::Free = in_free;
    JPH::AlignedAllocate = in_aligned_alloc;
    JPH::AlignedFree = in_aligned_free;
#endif
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_CreateFactory(void)
{
    assert(JPH::Factory::sInstance == nullptr);
    JPH::Factory::sInstance = new JPH::Factory();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_DestroyFactory(void)
{
    assert(JPH::Factory::sInstance != nullptr);
    JPH::PhysicsMaterial::sDefault = nullptr;
    delete JPH::Factory::sInstance;
    JPH::Factory::sInstance = nullptr;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_RegisterTypes(void)
{
    JPH::RegisterTypes();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyCreationSettings_SetDefault(JPC_BodyCreationSettings *out_settings)
{
    assert(out_settings != nullptr);
    const JPH::BodyCreationSettings settings;
    *out_settings = *toJpc(&settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyCreationSettings_Set(JPC_BodyCreationSettings *out_settings,
                             const JPC_Shape *in_shape,
                             const JPC_Real in_position[3],
                             const float in_rotation[4],
                             JPC_MotionType in_motion_type,
                             JPC_ObjectLayer in_layer)
{
    assert(out_settings != nullptr && in_shape != nullptr && in_position != nullptr && in_rotation != nullptr);

    JPC_BodyCreationSettings settings;
    JPC_BodyCreationSettings_SetDefault(&settings);

    settings.position[0] = in_position[0];
    settings.position[1] = in_position[1];
    settings.position[2] = in_position[2];
    settings.rotation[0] = in_rotation[0];
    settings.rotation[1] = in_rotation[1];
    settings.rotation[2] = in_rotation[2];
    settings.rotation[3] = in_rotation[3];
    settings.object_layer = in_layer;
    settings.motion_type = in_motion_type;
    settings.shape = in_shape;

    *out_settings = settings;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_TempAllocator
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_TempAllocator *
JPC_TempAllocator_Create(uint32_t in_size)
{
    auto impl = new JPH::TempAllocatorImpl(in_size);
    return reinterpret_cast<JPC_TempAllocator *>(impl);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TempAllocator_Destroy(JPC_TempAllocator *in_allocator)
{
    assert(in_allocator != nullptr);
    delete reinterpret_cast<JPH::TempAllocator *>(in_allocator);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_JobSystem
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_JobSystem *
JPC_JobSystem_Create(uint32_t in_max_jobs, uint32_t in_max_barriers, int in_num_threads)
{
    auto job_system = new JPH::JobSystemThreadPool(in_max_jobs, in_max_barriers, in_num_threads);
    return reinterpret_cast<JPC_JobSystem *>(job_system);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_JobSystem_Destroy(JPC_JobSystem *in_job_system)
{
    assert(in_job_system != nullptr);
    delete reinterpret_cast<JPH::JobSystemThreadPool *>(in_job_system);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_PhysicsSystem
//
//--------------------------------------------------------------------------------------------------
class ContactListener : public JPH::ContactListener
{
public:
    JPH::ValidateResult OnContactValidate(
        const JPH::Body &inBody1,
        const JPH::Body &inBody2,
        JPH::RVec3Arg inBaseOffset,
        const JPH::CollideShapeResult &inCollisionResult) override
    {
        if (c_listener->vtbl->OnContactValidate)
        {
            JPC_Real base_offset[3];
            storeRVec3(base_offset, inBaseOffset);

            const JPC_ValidateResult res = c_listener->vtbl->OnContactValidate(
                    c_listener, toJpc(&inBody1), toJpc(&inBody2), base_offset, toJpc(&inCollisionResult));

            return static_cast<JPH::ValidateResult>(res);
        }
        return JPH::ContactListener::OnContactValidate(inBody1, inBody2, inBaseOffset, inCollisionResult);
    }

    void OnContactAdded(
        const JPH::Body &inBody1,
        const JPH::Body &inBody2,
        const JPH::ContactManifold &inManifold,
        JPH::ContactSettings &ioSettings) override
    {
        if (c_listener->vtbl->OnContactAdded)
        {
            c_listener->vtbl->OnContactAdded(
                c_listener, toJpc(&inBody1), toJpc(&inBody2), toJpc(&inManifold), toJpc(&ioSettings));
        }
    }

    void OnContactPersisted(
        const JPH::Body &inBody1,
        const JPH::Body &inBody2,
        const JPH::ContactManifold &inManifold,
        JPH::ContactSettings &ioSettings) override
    {
        if (c_listener->vtbl->OnContactPersisted)
        {
            c_listener->vtbl->OnContactPersisted(
                c_listener, toJpc(&inBody1), toJpc(&inBody2), toJpc(&inManifold), toJpc(&ioSettings));
        }
    }

    void OnContactRemoved(const JPH::SubShapeIDPair &inSubShapePair) override
    {
        if (c_listener->vtbl->OnContactRemoved)
            c_listener->vtbl->OnContactRemoved(c_listener, toJpc(&inSubShapePair));
    }

    struct CListener
    {
        JPC_ContactListenerVTable *vtbl;
    };
    CListener *c_listener;
};

struct PhysicsSystemData
{
    uint64_t safety_token = 0xC0DEC0DEC0DEC0DE;
    ContactListener *contact_listener = nullptr;
};

JPC_API JPC_PhysicsSystem *
JPC_PhysicsSystem_Create(uint32_t in_max_bodies,
                         uint32_t in_num_body_mutexes,
                         uint32_t in_max_body_pairs,
                         uint32_t in_max_contact_constraints,
                         const void *in_broad_phase_layer_interface,
                         const void *in_object_vs_broad_phase_layer_filter,
                         const void *in_object_layer_pair_filter)
{
    assert(in_broad_phase_layer_interface != nullptr);
    assert(in_object_vs_broad_phase_layer_filter != nullptr);
    assert(in_object_layer_pair_filter != nullptr);

    auto physics_system =
        static_cast<JPH::PhysicsSystem *>(
            JPH::Allocate(sizeof(JPH::PhysicsSystem) + sizeof(PhysicsSystemData)));
    ::new (physics_system) JPH::PhysicsSystem();

    PhysicsSystemData* data =
        ::new (reinterpret_cast<uint8_t *>(physics_system) + sizeof(JPH::PhysicsSystem)) PhysicsSystemData();
    assert(data->safety_token == 0xC0DEC0DEC0DEC0DE);

    physics_system->Init(
        in_max_bodies,
        in_num_body_mutexes,
        in_max_body_pairs,
        in_max_contact_constraints,
        *static_cast<const JPH::BroadPhaseLayerInterface *>(in_broad_phase_layer_interface),
        *static_cast<const JPH::ObjectVsBroadPhaseLayerFilter *>(in_object_vs_broad_phase_layer_filter),
        *static_cast<const JPH::ObjectLayerPairFilter *>(in_object_layer_pair_filter));

    return toJpc(physics_system);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_Destroy(JPC_PhysicsSystem *in_physics_system)
{
    auto data = reinterpret_cast<PhysicsSystemData *>(
        reinterpret_cast<uint8_t *>(in_physics_system) + sizeof(JPH::PhysicsSystem));
    assert(data->safety_token == 0xC0DEC0DEC0DEC0DE);

    if (data->contact_listener)
    {
        data->contact_listener->~ContactListener();
        JPH::Free(data->contact_listener);
    }

    toJph(in_physics_system)->~PhysicsSystem();
    JPH::Free(in_physics_system);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_SetBodyActivationListener(JPC_PhysicsSystem *in_physics_system, void *in_listener)
{
    toJph(in_physics_system)->SetBodyActivationListener(static_cast<JPH::BodyActivationListener *>(in_listener));
}
//--------------------------------------------------------------------------------------------------
JPC_API void *
JPC_PhysicsSystem_GetBodyActivationListener(const JPC_PhysicsSystem *in_physics_system)
{
    return toJph(in_physics_system)->GetBodyActivationListener();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_SetContactListener(JPC_PhysicsSystem *in_physics_system, void *in_listener)
{
    if (in_listener == nullptr)
    {
        toJph(in_physics_system)->SetContactListener(nullptr);
        return;
    }

    auto data = reinterpret_cast<PhysicsSystemData *>(
        reinterpret_cast<uint8_t *>(in_physics_system) + sizeof(JPH::PhysicsSystem));
    assert(data->safety_token == 0xC0DEC0DEC0DEC0DE);

    if (data->contact_listener == nullptr)
    {
        data->contact_listener = static_cast<ContactListener *>(JPH::Allocate(sizeof(ContactListener)));
        ::new (data->contact_listener) ContactListener();
    }

    toJph(in_physics_system)->SetContactListener(data->contact_listener);

    data->contact_listener->c_listener = static_cast<ContactListener::CListener *>(in_listener);
}
//--------------------------------------------------------------------------------------------------
JPC_API void *
JPC_PhysicsSystem_GetContactListener(const JPC_PhysicsSystem *in_physics_system)
{
    auto listener = static_cast<ContactListener *>(toJph(in_physics_system)->GetContactListener());
    if (listener == nullptr)
        return nullptr;
    return listener->c_listener;
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_PhysicsSystem_GetNumBodies(const JPC_PhysicsSystem *in_physics_system)
{
    return toJph(in_physics_system)->GetNumBodies();
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_PhysicsSystem_GetNumActiveBodies(const JPC_PhysicsSystem *in_physics_system)
{
    return toJph(in_physics_system)->GetNumActiveBodies();
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_PhysicsSystem_GetMaxBodies(const JPC_PhysicsSystem *in_physics_system)
{
    return toJph(in_physics_system)->GetMaxBodies();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_GetGravity(const JPC_PhysicsSystem *in_physics_system, float out_gravity[3])
{
    storeVec3(out_gravity, toJph(in_physics_system)->GetGravity());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_SetGravity(JPC_PhysicsSystem *in_physics_system, const float in_gravity[3])
{
    toJph(in_physics_system)->SetGravity(loadVec3(in_gravity));
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_BodyInterface *
JPC_PhysicsSystem_GetBodyInterface(JPC_PhysicsSystem *in_physics_system)
{
    return toJpc(&toJph(in_physics_system)->GetBodyInterface());
}
JPC_API JPC_BodyInterface *
JPC_PhysicsSystem_GetBodyInterfaceNoLock(JPC_PhysicsSystem *in_physics_system)
{
    return toJpc(&toJph(in_physics_system)->GetBodyInterfaceNoLock());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_OptimizeBroadPhase(JPC_PhysicsSystem *in_physics_system)
{
    toJph(in_physics_system)->OptimizeBroadPhase();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_PhysicsSystem_Update(JPC_PhysicsSystem *in_physics_system,
                         float in_delta_time,
                         int in_collision_steps,
                         int in_integration_sub_steps,
                         JPC_TempAllocator *in_temp_allocator,
                         JPC_JobSystem *in_job_system)
{
    assert(in_temp_allocator != nullptr && in_job_system != nullptr);
    toJph(in_physics_system)->Update(
        in_delta_time,
        in_collision_steps,
        in_integration_sub_steps,
        reinterpret_cast<JPH::TempAllocator *>(in_temp_allocator),
        reinterpret_cast<JPH::JobSystem *>(in_job_system));
}
//--------------------------------------------------------------------------------------------------
JPC_API const JPC_BodyLockInterface *
JPC_PhysicsSystem_GetBodyLockInterface(const JPC_PhysicsSystem *in_physics_system)
{
    return toJpc(&toJph(in_physics_system)->GetBodyLockInterface());
}
JPC_API const JPC_BodyLockInterface *
JPC_PhysicsSystem_GetBodyLockInterfaceNoLock(const JPC_PhysicsSystem *in_physics_system)
{
    return toJpc(&toJph(in_physics_system)->GetBodyLockInterfaceNoLock());
}
//--------------------------------------------------------------------------------------------------
JPC_API const JPC_NarrowPhaseQuery *
JPC_PhysicsSystem_GetNarrowPhaseQuery(const JPC_PhysicsSystem *in_physics_system)
{
    return toJpc(&toJph(in_physics_system)->GetNarrowPhaseQuery());
}
JPC_API const JPC_NarrowPhaseQuery *
JPC_PhysicsSystem_GetNarrowPhaseQueryNoLock(const JPC_PhysicsSystem *in_physics_system)
{
    return toJpc(&toJph(in_physics_system)->GetNarrowPhaseQueryNoLock());
}
//--------------------------------------------------------------------------------------------------
//
// JPC_BodyLockInterface
//
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyLockInterface_LockRead(const JPC_BodyLockInterface *in_lock_interface,
                               JPC_BodyID in_body_id,
                               JPC_BodyLockRead *out_lock)
{
    assert(out_lock != nullptr);
    ::new (out_lock) JPH::BodyLockRead(*toJph(in_lock_interface), toJph(in_body_id));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyLockInterface_UnlockRead(const JPC_BodyLockInterface *in_lock_interface,
                                 JPC_BodyLockRead *io_lock)
{
    assert(io_lock != nullptr);
    assert(in_lock_interface != nullptr && in_lock_interface == io_lock->lock_interface);
    toJph(io_lock)->~BodyLockRead();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyLockInterface_LockWrite(const JPC_BodyLockInterface *in_lock_interface,
                                JPC_BodyID in_body_id,
                                JPC_BodyLockWrite *out_lock)
{
    assert(out_lock != nullptr);
    ::new (out_lock) JPH::BodyLockWrite(*toJph(in_lock_interface), toJph(in_body_id));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyLockInterface_UnlockWrite(const JPC_BodyLockInterface *in_lock_interface,
                                  JPC_BodyLockWrite *io_lock)
{
    assert(io_lock != nullptr);
    assert(in_lock_interface != nullptr && in_lock_interface == io_lock->lock_interface);
    toJph(io_lock)->~BodyLockWrite();
}
//--------------------------------------------------------------------------------------------------
//
// JPC_NarrowPhaseQuery
//
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_NarrowPhaseQuery_CastRay(const JPC_NarrowPhaseQuery *in_query,
                             const JPC_RRayCast *in_ray,
                             JPC_RayCastResult *io_hit,
                             const void *in_broad_phase_layer_filter,
                             const void *in_object_layer_filter,
                             const void *in_body_filter)
{
    assert(in_query && in_ray && io_hit);

    const JPH::BroadPhaseLayerFilter broad_phase_layer_filter{};
    const JPH::ObjectLayerFilter object_layer_filter{};
    const JPH::BodyFilter body_filter{};

    auto query = reinterpret_cast<const JPH::NarrowPhaseQuery *>(in_query);
    return query->CastRay(
        *reinterpret_cast<const JPH::RRayCast *>(in_ray),
        *reinterpret_cast<JPH::RayCastResult *>(io_hit),
        in_broad_phase_layer_filter ?
            *static_cast<const JPH::BroadPhaseLayerFilter *>(in_broad_phase_layer_filter) :
            broad_phase_layer_filter,
        in_object_layer_filter ?
            *static_cast<const JPH::ObjectLayerFilter *>(in_object_layer_filter) : object_layer_filter,
        in_body_filter ?
            *static_cast<const JPH::BodyFilter *>(in_body_filter) : body_filter);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_ShapeSettings
//
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ShapeSettings_AddRef(JPC_ShapeSettings *in_settings)
{
    toJph(in_settings)->AddRef();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ShapeSettings_Release(JPC_ShapeSettings *in_settings)
{
    toJph(in_settings)->Release();
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_ShapeSettings_GetRefCount(const JPC_ShapeSettings *in_settings)
{
    return toJph(in_settings)->GetRefCount();
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_Shape *
JPC_ShapeSettings_CreateShape(const JPC_ShapeSettings *in_settings)
{
    const JPH::Result result = toJph(in_settings)->Create();
    if (result.HasError()) return nullptr;
    JPH::Shape *shape = const_cast<JPH::Shape *>(result.Get().GetPtr());
    shape->AddRef();
    return toJpc(shape);
}
//--------------------------------------------------------------------------------------------------
JPC_API uint64_t
JPC_ShapeSettings_GetUserData(const JPC_ShapeSettings *in_settings)
{
    return toJph(in_settings)->mUserData;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ShapeSettings_SetUserData(JPC_ShapeSettings *in_settings, uint64_t in_user_data)
{
    toJph(in_settings)->mUserData = in_user_data;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_ConvexShapeSettings (-> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API const JPC_PhysicsMaterial *
JPC_ConvexShapeSettings_GetMaterial(const JPC_ConvexShapeSettings *in_settings)
{
    // TODO: Increment ref count?
    return toJpc(toJph(in_settings)->mMaterial.GetPtr());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ConvexShapeSettings_SetMaterial(JPC_ConvexShapeSettings *in_settings,
                                    const JPC_PhysicsMaterial *in_material)
{
    toJph(in_settings)->mMaterial = toJph(in_material);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_ConvexShapeSettings_GetDensity(const JPC_ConvexShapeSettings *in_settings)
{
    return toJph(in_settings)->mDensity;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ConvexShapeSettings_SetDensity(JPC_ConvexShapeSettings *in_settings, float in_density)
{
    toJph(in_settings)->SetDensity(in_density);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_BoxShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_BoxShapeSettings *
JPC_BoxShapeSettings_Create0(const float in_half_extent[3], const float in_convex_radius)
{
    auto settings = new JPH::BoxShapeSettings(loadVec3(in_half_extent), in_convex_radius);
    settings->AddRef();
    return toJpc(settings);
}

JPC_API JPC_BoxShapeSettings *
JPC_BoxShapeSettings_Create1(const float in_half_extent[3])
{
    auto settings = new JPH::BoxShapeSettings(loadVec3(in_half_extent));
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BoxShapeSettings_GetHalfExtent(const JPC_BoxShapeSettings *in_settings, float out_half_extent[3])
{
    storeVec3(out_half_extent, toJph(in_settings)->mHalfExtent);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BoxShapeSettings_SetHalfExtent(JPC_BoxShapeSettings *in_settings, const float in_half_extent[3])
{
    toJph(in_settings)->mHalfExtent = loadVec3(in_half_extent);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_BoxShapeSettings_GetConvexRadius(const JPC_BoxShapeSettings *in_settings)
{
    return toJph(in_settings)->mConvexRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BoxShapeSettings_SetConvexRadius(JPC_BoxShapeSettings *in_settings, float in_convex_radius)
{
    toJph(in_settings)->mConvexRadius = in_convex_radius;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_SphereShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_SphereShapeSettings *
JPC_SphereShapeSettings_Create(float in_radius)
{
    auto settings = new JPH::SphereShapeSettings(in_radius);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_SphereShapeSettings_GetRadius(const JPC_SphereShapeSettings *in_settings)
{
    return toJph(in_settings)->mRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_SphereShapeSettings_SetRadius(JPC_SphereShapeSettings *in_settings, float in_radius)
{
    toJph(in_settings)->mRadius = in_radius;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_TriangleShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_TriangleShapeSettings *
JPC_TriangleShapeSettings_Create(const float in_v1[3], const float in_v2[3], const float in_v3[3])
{
    auto settings = new JPH::TriangleShapeSettings(loadVec3(in_v1), loadVec3(in_v2), loadVec3(in_v3));
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TriangleShapeSettings_SetVertices(JPC_TriangleShapeSettings *in_settings,
                                      const float in_v1[3],
                                      const float in_v2[3],
                                      const float in_v3[3])
{
    JPH::TriangleShapeSettings *settings = toJph(in_settings);
    settings->mV1 = loadVec3(in_v1);
    settings->mV2 = loadVec3(in_v2);
    settings->mV3 = loadVec3(in_v3);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TriangleShapeSettings_GetVertices(const JPC_TriangleShapeSettings *in_settings,
                                      float out_v1[3],
                                      float out_v2[3],
                                      float out_v3[3])
{
    const JPH::TriangleShapeSettings *settings = toJph(in_settings);
    storeVec3(out_v1, settings->mV1);
    storeVec3(out_v2, settings->mV2);
    storeVec3(out_v3, settings->mV3);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_TriangleShapeSettings_GetConvexRadius(const JPC_TriangleShapeSettings *in_settings)
{
    return toJph(in_settings)->mConvexRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TriangleShapeSettings_SetConvexRadius(JPC_TriangleShapeSettings *in_settings, float in_convex_radius)
{
    toJph(in_settings)->mConvexRadius = in_convex_radius;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_CapsuleShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_CapsuleShapeSettings *
JPC_CapsuleShapeSettings_Create(float in_half_height_of_cylinder, float in_radius)
{
    auto settings = new JPH::CapsuleShapeSettings(in_half_height_of_cylinder, in_radius);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_CapsuleShapeSettings_GetHalfHeight(const JPC_CapsuleShapeSettings *in_settings)
{
    return toJph(in_settings)->mHalfHeightOfCylinder;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_CapsuleShapeSettings_SetHalfHeight(JPC_CapsuleShapeSettings *in_settings,
                                       float in_half_height_of_cylinder)
{
    toJph(in_settings)->mHalfHeightOfCylinder = in_half_height_of_cylinder;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_CapsuleShapeSettings_GetRadius(const JPC_CapsuleShapeSettings *in_settings)
{
    return toJph(in_settings)->mRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_CapsuleShapeSettings_SetRadius(JPC_CapsuleShapeSettings *in_settings, float in_radius)
{
    toJph(in_settings)->mRadius = in_radius;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_TaperedCapsuleShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_TaperedCapsuleShapeSettings *
JPC_TaperedCapsuleShapeSettings_Create(float in_half_height, float in_top_radius, float in_bottom_radius)
{
    auto settings = new JPH::TaperedCapsuleShapeSettings(in_half_height, in_top_radius, in_bottom_radius);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_TaperedCapsuleShapeSettings_GetHalfHeight(const JPC_TaperedCapsuleShapeSettings *in_settings)
{
    return toJph(in_settings)->mHalfHeightOfTaperedCylinder;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TaperedCapsuleShapeSettings_SetHalfHeight(JPC_TaperedCapsuleShapeSettings *in_settings,
                                              float in_half_height)
{
    toJph(in_settings)->mHalfHeightOfTaperedCylinder = in_half_height;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_TaperedCapsuleShapeSettings_GetTopRadius(const JPC_TaperedCapsuleShapeSettings *in_settings)
{
    return toJph(in_settings)->mTopRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TaperedCapsuleShapeSettings_SetTopRadius(JPC_TaperedCapsuleShapeSettings *in_settings, float in_top_radius)
{
    toJph(in_settings)->mTopRadius = in_top_radius;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_TaperedCapsuleShapeSettings_GetBottomRadius(const JPC_TaperedCapsuleShapeSettings *in_settings)
{
    return toJph(in_settings)->mBottomRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_TaperedCapsuleShapeSettings_SetBottomRadius(JPC_TaperedCapsuleShapeSettings *in_settings,
                                                float in_bottom_radius)
{
    toJph(in_settings)->mBottomRadius = in_bottom_radius;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_CylinderShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_CylinderShapeSettings *
JPC_CylinderShapeSettings_Create(float in_half_height, float in_radius)
{
    auto settings = new JPH::CylinderShapeSettings(in_half_height, in_radius);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_CylinderShapeSettings_GetConvexRadius(const JPC_CylinderShapeSettings *in_settings)
{
    return toJph(in_settings)->mConvexRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_CylinderShapeSettings_SetConvexRadius(JPC_CylinderShapeSettings *in_settings, float in_convex_radius)
{
    toJph(in_settings)->mConvexRadius = in_convex_radius;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_CylinderShapeSettings_GetHalfHeight(const JPC_CylinderShapeSettings *in_settings)
{
    return toJph(in_settings)->mHalfHeight;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_CylinderShapeSettings_SetHalfHeight(JPC_CylinderShapeSettings *in_settings, float in_half_height)
{
    toJph(in_settings)->mHalfHeight = in_half_height;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_CylinderShapeSettings_GetRadius(const JPC_CylinderShapeSettings *in_settings)
{
    return toJph(in_settings)->mRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_CylinderShapeSettings_SetRadius(JPC_CylinderShapeSettings *in_settings, float in_radius)
{
    toJph(in_settings)->mRadius = in_radius;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_ConvexHullShapeSettings (-> JPC_ConvexShapeSettings -> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_ConvexHullShapeSettings *
JPC_ConvexHullShapeSettings_Create(const void *in_vertices, uint32_t in_num_vertices, uint32_t in_vertex_size)
{
    assert(in_vertices && in_num_vertices >= 3);
    assert(in_vertex_size >= 3 * sizeof(float));

    JPH::Array<JPH::Vec3> points;
    points.reserve(in_num_vertices);

    for (uint32_t i = 0; i < in_num_vertices; ++i)
    {
        const uint8_t *base = static_cast<const uint8_t *>(in_vertices) + i * in_vertex_size;
        points.push_back(loadVec3(reinterpret_cast<const float *>(base)));
    }

    auto settings = new JPH::ConvexHullShapeSettings(points);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_ConvexHullShapeSettings_GetMaxConvexRadius(const JPC_ConvexHullShapeSettings *in_settings)
{
    return toJph(in_settings)->mMaxConvexRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ConvexHullShapeSettings_SetMaxConvexRadius(JPC_ConvexHullShapeSettings *in_settings,
                                               float in_max_convex_radius)
{
    toJph(in_settings)->mMaxConvexRadius = in_max_convex_radius;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_ConvexHullShapeSettings_GetMaxErrorConvexRadius(const JPC_ConvexHullShapeSettings *in_settings)
{
    return toJph(in_settings)->mMaxErrorConvexRadius;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ConvexHullShapeSettings_SetMaxErrorConvexRadius(JPC_ConvexHullShapeSettings *in_settings,
                                                    float in_max_err_convex_radius)
{
    toJph(in_settings)->mMaxErrorConvexRadius = in_max_err_convex_radius;
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_ConvexHullShapeSettings_GetHullTolerance(const JPC_ConvexHullShapeSettings *in_settings)
{
    return toJph(in_settings)->mHullTolerance;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_ConvexHullShapeSettings_SetHullTolerance(JPC_ConvexHullShapeSettings *in_settings,
                                             float in_hull_tolerance)
{
    toJph(in_settings)->mHullTolerance = in_hull_tolerance;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_HeightFieldShapeSettings (-> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_HeightFieldShapeSettings *
JPC_HeightFieldShapeSettings_Create(const float *in_samples, uint32_t in_height_field_size)
{
    assert(in_samples != nullptr && in_height_field_size >= 2);
    auto settings = new JPH::HeightFieldShapeSettings(
        in_samples, JPH::Vec3(0,0,0), JPH::Vec3(1,1,1), in_height_field_size);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_HeightFieldShapeSettings_GetOffset(const JPC_HeightFieldShapeSettings *in_settings, float out_offset[3])
{
    storeVec3(out_offset, toJph(in_settings)->mOffset);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_HeightFieldShapeSettings_SetOffset(JPC_HeightFieldShapeSettings *in_settings, const float in_offset[3])
{
    toJph(in_settings)->mOffset = loadVec3(in_offset);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_HeightFieldShapeSettings_GetScale(const JPC_HeightFieldShapeSettings *in_settings, float out_scale[3])
{
    storeVec3(out_scale, toJph(in_settings)->mScale);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_HeightFieldShapeSettings_SetScale(JPC_HeightFieldShapeSettings *in_settings, const float in_scale[3])
{
    toJph(in_settings)->mScale = loadVec3(in_scale);
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_HeightFieldShapeSettings_GetBlockSize(const JPC_HeightFieldShapeSettings *in_settings)
{
    return toJph(in_settings)->mBlockSize;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_HeightFieldShapeSettings_SetBlockSize(JPC_HeightFieldShapeSettings *in_settings, uint32_t in_block_size)
{
    toJph(in_settings)->mBlockSize = in_block_size;
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_HeightFieldShapeSettings_GetBitsPerSample(const JPC_HeightFieldShapeSettings *in_settings)
{
    return toJph(in_settings)->mBitsPerSample;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_HeightFieldShapeSettings_SetBitsPerSample(JPC_HeightFieldShapeSettings *in_settings, uint32_t in_num_bits)
{
    toJph(in_settings)->mBitsPerSample = in_num_bits;
}
//--------------------------------------------------------------------------------------------------
//
// JPC_MeshShapeSettings (-> JPC_ShapeSettings)
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_MeshShapeSettings *
JPC_MeshShapeSettings_Create(const void *in_vertices,
                             uint32_t in_num_vertices,
                             uint32_t in_vertex_size,
                             const uint32_t *in_indices,
                             uint32_t in_num_indices)
{
    assert(in_vertices && in_indices);
    assert(in_num_vertices >= 3);
    assert(in_vertex_size >= 3 * sizeof(float));
    assert(in_num_indices >= 3 && in_num_indices % 3 == 0);

    JPH::VertexList vertices;
    vertices.reserve(in_num_vertices);

    for (uint32_t i = 0; i < in_num_vertices; ++i)
    {
        const float *base = reinterpret_cast<const float *>(
            static_cast<const uint8_t *>(in_vertices) + i * in_vertex_size);
        vertices.push_back(JPH::Float3(base[0], base[1], base[2]));
    }

    JPH::IndexedTriangleList triangles;
    triangles.reserve(in_num_indices / 3);

    for (uint32_t i = 0; i < in_num_indices / 3; ++i)
    {
        triangles.push_back(
            JPH::IndexedTriangle(in_indices[i * 3], in_indices[i * 3 + 1], in_indices[i * 3 + 2], 0));
    }

    auto settings = new JPH::MeshShapeSettings(vertices, triangles);
    settings->AddRef();
    return toJpc(settings);
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf(const JPC_MeshShapeSettings *in_settings)
{
    return toJph(in_settings)->mMaxTrianglesPerLeaf;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf(JPC_MeshShapeSettings *in_settings, uint32_t in_max_triangles)
{
    toJph(in_settings)->mMaxTrianglesPerLeaf = in_max_triangles;
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MeshShapeSettings_Sanitize(JPC_MeshShapeSettings *in_settings)
{
    toJph(in_settings)->Sanitize();
}
//--------------------------------------------------------------------------------------------------
//
// JPC_Shape
//
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Shape_AddRef(JPC_Shape *in_shape)
{
    toJph(in_shape)->AddRef();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Shape_Release(JPC_Shape *in_shape)
{
    toJph(in_shape)->Release();
}
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_Shape_GetRefCount(const JPC_Shape *in_shape)
{
    return toJph(in_shape)->GetRefCount();
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_ShapeType
JPC_Shape_GetType(const JPC_Shape *in_shape)
{
    return toJpc(toJph(in_shape)->GetType());
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_ShapeSubType
JPC_Shape_GetSubType(const JPC_Shape *in_shape)
{
    return toJpc(toJph(in_shape)->GetSubType());
}
//--------------------------------------------------------------------------------------------------
JPC_API uint64_t
JPC_Shape_GetUserData(const JPC_Shape *in_shape)
{
    return toJph(in_shape)->GetUserData();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Shape_SetUserData(JPC_Shape *in_shape, uint64_t in_user_data)
{
    return toJph(in_shape)->SetUserData(in_user_data);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_BodyInterface
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_Body *
JPC_BodyInterface_CreateBody(JPC_BodyInterface *in_iface, const JPC_BodyCreationSettings *in_settings)
{
    return toJpc(toJph(in_iface)->CreateBody(*toJph(in_settings)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_DestroyBody(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id)
{
    toJph(in_iface)->DestroyBody(toJph(in_body_id));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddBody(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id, JPC_Activation in_mode)
{
    toJph(in_iface)->AddBody(toJph(in_body_id), static_cast<JPH::EActivation>(in_mode));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_RemoveBody(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id)
{
    toJph(in_iface)->RemoveBody(toJph(in_body_id));
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_BodyID
JPC_BodyInterface_CreateAndAddBody(JPC_BodyInterface *in_iface,
                                   const JPC_BodyCreationSettings *in_settings,
                                   JPC_Activation in_mode)
{
    return toJpc(toJph(in_iface)->CreateAndAddBody(*toJph(in_settings),
        static_cast<JPH::EActivation>(in_mode)));
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_BodyInterface_IsAdded(const JPC_BodyInterface *in_iface, JPC_BodyID in_body_id)
{
    return toJph(in_iface)->IsAdded(toJph(in_body_id));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_SetLinearAndAngularVelocity(JPC_BodyInterface *in_iface,
                                              JPC_BodyID in_body_id,
                                              const float in_linear_velocity[3],
                                              const float in_angular_velocity[3])
{
    toJph(in_iface)->SetLinearAndAngularVelocity(
        toJph(in_body_id), loadVec3(in_linear_velocity), loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_GetLinearAndAngularVelocity(const JPC_BodyInterface *in_iface,
                                              JPC_BodyID in_body_id,
                                              float out_linear_velocity[3],
                                              float out_angular_velocity[3])
{
    JPH::Vec3 linear, angular;
    toJph(in_iface)->GetLinearAndAngularVelocity(toJph(in_body_id), linear, angular);
    storeVec3(out_linear_velocity, linear);
    storeVec3(out_angular_velocity, angular);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_SetLinearVelocity(JPC_BodyInterface *in_iface,
                                    JPC_BodyID in_body_id,
                                    const float in_velocity[3])
{
    toJph(in_iface)->SetLinearVelocity(toJph(in_body_id), loadVec3(in_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_GetLinearVelocity(const JPC_BodyInterface *in_iface,
                                    JPC_BodyID in_body_id,
                                    float out_velocity[3])
{
    storeVec3(out_velocity, toJph(in_iface)->GetLinearVelocity(toJph(in_body_id)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddLinearVelocity(JPC_BodyInterface *in_iface,
                                    JPC_BodyID in_body_id,
                                    const float in_velocity[3])
{
    toJph(in_iface)->AddLinearVelocity(toJph(in_body_id), loadVec3(in_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddLinearAndAngularVelocity(JPC_BodyInterface *in_iface,
                                              JPC_BodyID in_body_id,
                                              const float in_linear_velocity[3],
                                              const float in_angular_velocity[3])
{
    toJph(in_iface)->AddLinearAndAngularVelocity(
        toJph(in_body_id), loadVec3(in_linear_velocity), loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_SetAngularVelocity(JPC_BodyInterface *in_iface,
                                     JPC_BodyID in_body_id,
                                     const float in_velocity[3])
{
    toJph(in_iface)->SetAngularVelocity(toJph(in_body_id), loadVec3(in_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_GetAngularVelocity(const JPC_BodyInterface *in_iface,
                                     JPC_BodyID in_body_id,
                                     float out_velocity[3])
{
    storeVec3(out_velocity, toJph(in_iface)->GetAngularVelocity(toJph(in_body_id)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_GetPointVelocity(const JPC_BodyInterface *in_iface,
                                   JPC_BodyID in_body_id,
                                   const JPC_Real in_point[3],
                                   float out_velocity[3])
{
    storeVec3(out_velocity, toJph(in_iface)->GetPointVelocity(toJph(in_body_id), loadRVec3(in_point)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_GetCenterOfMassPosition(const JPC_BodyInterface *in_iface,
                                          JPC_BodyID in_body_id,
                                          JPC_Real out_position[3])
{
    storeRVec3(out_position, toJph(in_iface)->GetCenterOfMassPosition(toJph(in_body_id)));
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_BodyInterface_IsActive(const JPC_BodyInterface *in_iface, JPC_BodyID in_body_id)
{
    return toJph(in_iface)->IsActive(toJph(in_body_id));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_SetPositionRotationAndVelocity(JPC_BodyInterface *in_iface,
                                                 JPC_BodyID in_body_id,
                                                 const JPC_Real in_position[3],
                                                 const float in_rotation[4],
                                                 const float in_linear_velocity[3],
                                                 const float in_angular_velocity[3])
{
    toJph(in_iface)->SetPositionRotationAndVelocity(
        toJph(in_body_id),
        loadRVec3(in_position),
        JPH::Quat(loadVec4(in_rotation)),
        loadVec3(in_linear_velocity),
        loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddForce(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id, const float in_force[3])
{
    toJph(in_iface)->AddForce(toJph(in_body_id), loadVec3(in_force));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddForceAtPosition(JPC_BodyInterface *in_iface,
                                     JPC_BodyID in_body_id,
                                     const float in_force[3],
                                     const JPC_Real in_position[3])
{
    toJph(in_iface)->AddForce(toJph(in_body_id), loadVec3(in_force), loadRVec3(in_position));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddTorque(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id, const float in_torque[3])
{
    toJph(in_iface)->AddTorque(toJph(in_body_id), loadVec3(in_torque));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddForceAndTorque(JPC_BodyInterface *in_iface,
                                    JPC_BodyID in_body_id,
                                    const float in_force[3],
                                    const float in_torque[3])
{
    toJph(in_iface)->AddForceAndTorque(toJph(in_body_id), loadVec3(in_force), loadVec3(in_torque));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddImpulse(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id, const float in_impulse[3])
{
    toJph(in_iface)->AddImpulse(toJph(in_body_id), loadVec3(in_impulse));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddImpulseAtPosition(JPC_BodyInterface *in_iface,
                                       JPC_BodyID in_body_id,
                                       const float in_impulse[3],
                                       const JPC_Real in_position[3])
{
    toJph(in_iface)->AddImpulse(toJph(in_body_id), loadVec3(in_impulse), loadRVec3(in_position));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_BodyInterface_AddAngularImpulse(JPC_BodyInterface *in_iface, JPC_BodyID in_body_id, const float in_impulse[3])
{
    toJph(in_iface)->AddAngularImpulse(toJph(in_body_id), loadVec3(in_impulse));
}
//--------------------------------------------------------------------------------------------------
//
// JPC_Body
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_BodyID
JPC_Body_GetID(const JPC_Body *in_body)
{
    return toJph(in_body)->GetID().GetIndexAndSequenceNumber();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsActive(const JPC_Body *in_body)
{
    return toJph(in_body)->IsActive();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsStatic(const JPC_Body *in_body)
{
    return toJph(in_body)->IsStatic();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsKinematic(const JPC_Body *in_body)
{
    return toJph(in_body)->IsKinematic();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsDynamic(const JPC_Body *in_body)
{
    return toJph(in_body)->IsDynamic();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_CanBeKinematicOrDynamic(const JPC_Body *in_body)
{
    return toJph(in_body)->CanBeKinematicOrDynamic();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetIsSensor(JPC_Body *in_body, bool in_is_sensor)
{
    toJph(in_body)->SetIsSensor(in_is_sensor);
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsSensor(const JPC_Body *in_body)
{
    return toJph(in_body)->IsSensor();
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_MotionType
JPC_Body_GetMotionType(const JPC_Body *in_body)
{
    return toJpc(toJph(in_body)->GetMotionType());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetMotionType(JPC_Body *in_body, JPC_MotionType in_motion_type)
{
    toJph(in_body)->SetMotionType(static_cast<JPH::EMotionType>(in_motion_type));
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_BroadPhaseLayer
JPC_Body_GetBroadPhaseLayer(const JPC_Body *in_body)
{
    return toJpc(toJph(in_body)->GetBroadPhaseLayer());
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_ObjectLayer
JPC_Body_GetObjectLayer(const JPC_Body *in_body)
{
    return toJpc(toJph(in_body)->GetObjectLayer());
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_CollisionGroup *
JPC_Body_GetCollisionGroup(JPC_Body *in_body)
{
    return toJpc(&toJph(in_body)->GetCollisionGroup());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetCollisionGroup(JPC_Body *in_body, const JPC_CollisionGroup *in_group)
{
    toJph(in_body)->SetCollisionGroup(*toJph(in_group));
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_GetAllowSleeping(const JPC_Body *in_body)
{
    return toJph(in_body)->GetAllowSleeping();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetAllowSleeping(JPC_Body *in_body, bool in_allow)
{
    toJph(in_body)->SetAllowSleeping(in_allow);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_Body_GetFriction(const JPC_Body *in_body)
{
    return toJph(in_body)->GetFriction();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetFriction(JPC_Body *in_body, float in_friction)
{
    toJph(in_body)->SetFriction(in_friction);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_Body_GetRestitution(const JPC_Body *in_body)
{
    return toJph(in_body)->GetRestitution();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetRestitution(JPC_Body *in_body, float in_restitution)
{
    toJph(in_body)->SetRestitution(in_restitution);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetLinearVelocity(const JPC_Body *in_body, float out_linear_velocity[3])
{
    storeVec3(out_linear_velocity, toJph(in_body)->GetLinearVelocity());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetLinearVelocity(JPC_Body *in_body, const float in_linear_velocity[3])
{
    toJph(in_body)->SetLinearVelocity(loadVec3(in_linear_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetLinearVelocityClamped(JPC_Body *in_body, const float in_linear_velocity[3])
{
    toJph(in_body)->SetLinearVelocityClamped(loadVec3(in_linear_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetAngularVelocity(const JPC_Body *in_body, float out_angular_velocity[3])
{
    storeVec3(out_angular_velocity, toJph(in_body)->GetAngularVelocity());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetAnglularVelocity(JPC_Body *in_body, const float in_angular_velocity[3])
{
    toJph(in_body)->SetAngularVelocity(loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetAnglularVelocityClamped(JPC_Body *in_body, const float in_angular_velocity[3])
{
    toJph(in_body)->SetAngularVelocityClamped(loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetPointVelocityCOM(const JPC_Body *in_body,
                             const float in_point_relative_to_com[3],
                             float out_velocity[3])
{
    storeVec3(out_velocity, toJph(in_body)->GetPointVelocityCOM(loadVec3(in_point_relative_to_com)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetPointVelocity(const JPC_Body *in_body, const JPC_Real in_point[3], float out_velocity[3])
{
    storeVec3(out_velocity, toJph(in_body)->GetPointVelocity(loadRVec3(in_point)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_AddForce(JPC_Body *in_body, const float in_force[3])
{
    toJph(in_body)->AddForce(loadVec3(in_force));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_AddForceAtPosition(JPC_Body *in_body, const float in_force[3], const JPC_Real in_position[3])
{
    toJph(in_body)->AddForce(loadVec3(in_force), loadRVec3(in_position));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_AddTorque(JPC_Body *in_body, const float in_torque[3])
{
    toJph(in_body)->AddTorque(loadVec3(in_torque));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetInverseInertia(const JPC_Body *in_body, float out_inverse_inertia[16])
{
    storeMat44(out_inverse_inertia, toJph(in_body)->GetInverseInertia());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_AddImpulse(JPC_Body *in_body, const float in_impulse[3])
{
    toJph(in_body)->AddImpulse(loadVec3(in_impulse));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_AddImpulseAtPosition(JPC_Body *in_body, const float in_impulse[3], const JPC_Real in_position[3])
{
    toJph(in_body)->AddImpulse(loadVec3(in_impulse), loadRVec3(in_position));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_AddAngularImpulse(JPC_Body *in_body, const float in_angular_impulse[3])
{
    toJph(in_body)->AddAngularImpulse(loadVec3(in_angular_impulse));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_MoveKinematic(JPC_Body *in_body,
                       const JPC_Real in_target_position[3],
                       const float in_target_rotation[4],
                       float in_delta_time)
{
    toJph(in_body)->MoveKinematic(
        loadRVec3(in_target_position), JPH::Quat(loadVec4(in_target_rotation)), in_delta_time);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_ApplyBuoyancyImpulse(JPC_Body *in_body,
                              const JPC_Real in_surface_position[3],
                              const float in_surface_normal[3],
                              float in_buoyancy,
                              float in_linear_drag,
                              float in_angular_drag,
                              const float in_fluid_velocity[3],
                              const float in_gravity[3],
                              float in_delta_time)
{
    toJph(in_body)->ApplyBuoyancyImpulse(
        loadRVec3(in_surface_position),
        loadVec3(in_surface_normal),
        in_buoyancy,
        in_linear_drag,
        in_angular_drag,
        loadVec3(in_fluid_velocity),
        loadVec3(in_gravity),
        in_delta_time);
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsInBroadPhase(const JPC_Body *in_body)
{
    return toJph(in_body)->IsInBroadPhase();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_Body_IsCollisionCacheInvalid(const JPC_Body *in_body)
{
    return toJph(in_body)->IsCollisionCacheInvalid();
}
//--------------------------------------------------------------------------------------------------
JPC_API const JPC_Shape *
JPC_Body_GetShape(const JPC_Body *in_body)
{
    return toJpc(toJph(in_body)->GetShape());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetPosition(const JPC_Body *in_body, JPC_Real out_position[3])
{
    storeRVec3(out_position, toJph(in_body)->GetPosition());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetRotation(const JPC_Body *in_body, float out_rotation[4])
{
    storeVec4(out_rotation, toJph(in_body)->GetRotation().GetXYZW());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetWorldTransform(const JPC_Body *in_body, float out_rotation[9], JPC_Real out_translation[3])
{
    const JPH::RMat44 m = toJph(in_body)->GetWorldTransform();
    storeVec3(&out_rotation[0], m.GetColumn3(0));
    storeVec3(&out_rotation[3], m.GetColumn3(1));
    storeVec3(&out_rotation[6], m.GetColumn3(2));
    storeRVec3(&out_translation[0], m.GetTranslation());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetCenterOfMassPosition(const JPC_Body *in_body, JPC_Real out_position[3])
{
    storeRVec3(out_position, toJph(in_body)->GetCenterOfMassPosition());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetCenterOfMassTransform(const JPC_Body *in_body,
                                  float out_rotation[9],
                                  JPC_Real out_translation[3])
{
    const JPH::RMat44 m = toJph(in_body)->GetCenterOfMassTransform();
    storeVec3(&out_rotation[0], m.GetColumn3(0));
    storeVec3(&out_rotation[3], m.GetColumn3(1));
    storeVec3(&out_rotation[6], m.GetColumn3(2));
    storeRVec3(&out_translation[0], m.GetTranslation());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetInverseCenterOfMassTransform(const JPC_Body *in_body,
                                         float out_rotation[9],
                                         JPC_Real out_translation[3])
{
    const JPH::RMat44 m = toJph(in_body)->GetInverseCenterOfMassTransform();
    storeVec3(&out_rotation[0], m.GetColumn3(0));
    storeVec3(&out_rotation[3], m.GetColumn3(1));
    storeVec3(&out_rotation[6], m.GetColumn3(2));
    storeRVec3(&out_translation[0], m.GetTranslation());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetWorldSpaceBounds(const JPC_Body *in_body, float out_min[3], float out_max[3])
{
    const JPH::AABox& aabb = toJph(in_body)->GetWorldSpaceBounds();
    storeVec3(out_min, aabb.mMin);
    storeVec3(out_min, aabb.mMax);
}
//--------------------------------------------------------------------------------------------------
JPC_API JPC_MotionProperties *
JPC_Body_GetMotionProperties(JPC_Body *in_body)
{
    return toJpc(toJph(in_body)->GetMotionProperties());
}
//--------------------------------------------------------------------------------------------------
JPC_API uint64_t
JPC_Body_GetUserData(const JPC_Body *in_body)
{
    return toJph(in_body)->GetUserData();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_SetUserData(JPC_Body *in_body, uint64_t in_user_data)
{
    toJph(in_body)->SetUserData(in_user_data);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_Body_GetWorldSpaceSurfaceNormal(const JPC_Body *in_body,
                                    JPC_SubShapeID in_sub_shape_id,
                                    const JPC_Real in_position[3],
                                    float out_normal_vector[3])
{
    const JPH::Vec3 v = toJph(in_body)->GetWorldSpaceSurfaceNormal(
        *toJph(&in_sub_shape_id), loadRVec3(in_position));
    storeVec3(out_normal_vector, v);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_MotionProperties
//
//--------------------------------------------------------------------------------------------------
JPC_API JPC_MotionQuality
JPC_MotionProperties_GetMotionQuality(const JPC_MotionProperties *in_properties)
{
    return toJpc(toJph(in_properties)->GetMotionQuality());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetLinearVelocity(const JPC_MotionProperties *in_properties,
                                       float out_linear_velocity[3])
{
    storeVec3(out_linear_velocity, toJph(in_properties)->GetLinearVelocity());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetLinearVelocity(JPC_MotionProperties *in_properties,
                                       const float in_linear_velocity[3])
{
    toJph(in_properties)->SetLinearVelocity(loadVec3(in_linear_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetLinearVelocityClamped(JPC_MotionProperties *in_properties,
                                              const float in_linear_velocity[3])
{
    toJph(in_properties)->SetLinearVelocityClamped(loadVec3(in_linear_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetAngularVelocity(const JPC_MotionProperties *in_properties,
                                        float out_angular_velocity[3])
{
    storeVec3(out_angular_velocity, toJph(in_properties)->GetAngularVelocity());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetAngularVelocity(JPC_MotionProperties *in_properties,
                                        const float in_angular_velocity[3])
{
    toJph(in_properties)->SetAngularVelocity(loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetAngularVelocityClamped(JPC_MotionProperties *in_properties,
                                               const float in_angular_velocity[3])
{
    toJph(in_properties)->SetAngularVelocityClamped(loadVec3(in_angular_velocity));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_MoveKinematic(JPC_MotionProperties *in_properties,
                                   const float in_delta_position[3],
                                   const float in_delta_rotation[4],
                                   float in_delta_time)
{
    toJph(in_properties)->MoveKinematic(
        loadVec3(in_delta_position), JPH::Quat(loadVec4(in_delta_rotation)), in_delta_time);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_ClampLinearVelocity(JPC_MotionProperties *in_properties)
{
    toJph(in_properties)->ClampLinearVelocity();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_ClampAngularVelocity(JPC_MotionProperties *in_properties)
{
    toJph(in_properties)->ClampAngularVelocity();
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_MotionProperties_GetLinearDamping(const JPC_MotionProperties *in_properties)
{
    return toJph(in_properties)->GetLinearDamping();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetLinearDamping(JPC_MotionProperties *in_properties,
                                      float in_linear_damping)
{
    toJph(in_properties)->SetLinearDamping(in_linear_damping);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_MotionProperties_GetAngularDamping(const JPC_MotionProperties *in_properties)
{
    return toJph(in_properties)->GetAngularDamping();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetAngularDamping(JPC_MotionProperties *in_properties,
                                       float in_angular_damping)
{
    toJph(in_properties)->SetAngularDamping(in_angular_damping);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_MotionProperties_GetGravityFactor(const JPC_MotionProperties *in_properties)
{
    return toJph(in_properties)->GetGravityFactor();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetGravityFactor(JPC_MotionProperties *in_properties,
                                      float in_gravity_factor)
{
    toJph(in_properties)->SetGravityFactor(in_gravity_factor);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetMassProperties(JPC_MotionProperties *in_properties,
                                       const JPC_MassProperties *in_mass_properties)
{
    toJph(in_properties)->SetMassProperties(*toJph(in_mass_properties));
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_MotionProperties_GetInverseMass(const JPC_MotionProperties *in_properties)
{
    return toJph(in_properties)->GetInverseMass();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetInverseMass(JPC_MotionProperties *in_properties, float in_inv_mass)
{
    toJph(in_properties)->SetInverseMass(in_inv_mass);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetInverseInertiaDiagonal(const JPC_MotionProperties *in_properties,
                                               float out_inverse_inertia_diagonal[3])
{
    storeVec3(out_inverse_inertia_diagonal, toJph(in_properties)->GetInverseInertiaDiagonal());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetInertiaRotation(const JPC_MotionProperties *in_properties,
                                        float out_inertia_rotation[4])
{
    storeVec4(out_inertia_rotation, toJph(in_properties)->GetInertiaRotation().GetXYZW());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetInverseInertia(JPC_MotionProperties *in_properties,
                                       const float in_diagonal[3],
                                       const float in_rotation[4])
{
    toJph(in_properties)->SetInverseInertia(
        loadVec3(in_diagonal),
        JPH::Quat(loadVec4(in_rotation)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetLocalSpaceInverseInertia(const JPC_MotionProperties *in_properties,
                                                 float out_matrix[16])
{
    storeMat44(out_matrix, toJph(in_properties)->GetLocalSpaceInverseInertia());
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetInverseInertiaForRotation(const JPC_MotionProperties *in_properties,
                                                  const float in_rotation_matrix[16],
                                                  float out_matrix[16])
{
    storeMat44(out_matrix, toJph(in_properties)->GetInverseInertiaForRotation(loadMat44(in_rotation_matrix)));
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector(const JPC_MotionProperties *in_properties,
                                                              const float in_body_rotation[4],
                                                              const float in_vector[3],
                                                              float out_vector[3])
{
    const JPH::Vec3 v = toJph(in_properties)->MultiplyWorldSpaceInverseInertiaByVector(
        JPH::Quat(loadVec4(in_body_rotation)), loadVec3(in_vector));
    storeVec3(out_vector, v);
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_GetPointVelocityCOM(const JPC_MotionProperties *in_properties,
                                         const float in_point_relative_to_com[3],
                                         float out_point[3])
{
    storeVec3(out_point, toJph(in_properties)->GetPointVelocityCOM(loadVec3(in_point_relative_to_com)));
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_MotionProperties_GetMaxLinearVelocity(const JPC_MotionProperties *in_properties)
{
    return toJph(in_properties)->GetMaxLinearVelocity();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetMaxLinearVelocity(JPC_MotionProperties *in_properties,
                                          float in_max_linear_velocity)
{
    toJph(in_properties)->SetMaxLinearVelocity(in_max_linear_velocity);
}
//--------------------------------------------------------------------------------------------------
JPC_API float
JPC_MotionProperties_GetMaxAngularVelocity(const JPC_MotionProperties *in_properties)
{
    return toJph(in_properties)->GetMaxAngularVelocity();
}
//--------------------------------------------------------------------------------------------------
JPC_API void
JPC_MotionProperties_SetMaxAngularVelocity(JPC_MotionProperties *in_properties,
                                           float in_max_angular_velocity)
{
    toJph(in_properties)->SetMaxAngularVelocity(in_max_angular_velocity);
}
//--------------------------------------------------------------------------------------------------
//
// JPC_BodyID
//
//--------------------------------------------------------------------------------------------------
JPC_API uint32_t
JPC_BodyID_GetIndex(JPC_BodyID in_body_id)
{
    return JPH::BodyID(in_body_id).GetIndex();
}
//--------------------------------------------------------------------------------------------------
JPC_API uint8_t
JPC_BodyID_GetSequenceNumber(JPC_BodyID in_body_id)
{
    return JPH::BodyID(in_body_id).GetSequenceNumber();
}
//--------------------------------------------------------------------------------------------------
JPC_API bool
JPC_BodyID_IsInvalid(JPC_BodyID in_body_id)
{
    return JPH::BodyID(in_body_id).IsInvalid();
}
//--------------------------------------------------------------------------------------------------
// JoltJava: Java support
JPC_API uint32_t
JPC_GetFeatures()
{
    uint32_t features = 0;
    #if JPC_DOUBLE_PRECISION == 1
    features |= 0x1;
    #endif
    return features;
}

JPC_API JPC_SphereShape *
JPC_SphereShape_Create(float in_radius)
{
    auto result = new JPH::SphereShape(in_radius);
    result->AddRef();
    return toJpc(result);
}
// END JoltJava
